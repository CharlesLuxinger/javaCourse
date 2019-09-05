package br.com.argentum.sxtream;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class LocalDateTimeConverterSX implements Converter {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public boolean canConvert(Class type) {
		return type.isAssignableFrom(LocalDateTime.class);
	}

	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		LocalDateTime date = (LocalDateTime) source;
		ZonedDateTime dateZone = date.atZone(ZoneOffset.systemDefault());
		long milis = dateZone.toInstant().toEpochMilli();

		writer.startNode("time");
		writer.setValue(String.valueOf(milis));
		writer.endNode();

		writer.startNode("timezone");
		writer.setValue(String.valueOf(dateZone.getZone().toString()));
		writer.endNode();
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		reader.moveDown();
		long milis = Long.parseLong(reader.getValue());
		reader.moveUp();

		reader.moveDown();
		String dateZone = reader.getValue();
		reader.moveUp();

		Instant time = Instant.ofEpochMilli(milis);

		ZoneId zone = ZoneId.of(dateZone);
		ZonedDateTime dateWithZone = ZonedDateTime.ofInstant(time, zone);

		return dateWithZone.toLocalDateTime();
	}

}
