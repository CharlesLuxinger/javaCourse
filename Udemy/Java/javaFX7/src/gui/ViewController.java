package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerson;

	@FXML
	private Button btShowAll;

	@FXML
	private TextArea txtDataTextArea;

	private ObservableList<Person> obsList;

	@FXML
	public void onComboBoxPersonAction() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();

		txtDataTextArea.setText(person.toString());
	}

	@FXML
	public void onBtShowAllAction() {
		StringBuilder text = new StringBuilder();
		for (Person p : comboBoxPerson.getItems()) {
			text.append(p.toString() + "\n");
		}
		if (text.toString() != null) {
			txtDataTextArea.setText(text.toString());

		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "Maria", "maria@gmail.com"));
		list.add(new Person(1, "Bob", "bob@gmail.com"));
		list.add(new Person(1, "João", "joao@gmail.com"));

		obsList = FXCollections.observableArrayList(list);
		comboBoxPerson.setItems(obsList);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};

		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));
	}

}
