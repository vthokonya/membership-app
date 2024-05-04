package zw.co.tayanasoft.views.memberform;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import zw.co.tayanasoft.data.SamplePerson;
import zw.co.tayanasoft.services.SamplePersonService;
import zw.co.tayanasoft.views.MainLayout;

@PageTitle("Member Form")
@Route(value = "member-form", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class MemberFormView extends Composite<VerticalLayout> {

    public MemberFormView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        DatePicker datePicker = new DatePicker();
        TextField textField3 = new TextField();
        EmailField emailField = new EmailField();
        TextField textField4 = new TextField();
        ComboBox comboBox = new ComboBox();
        TextField textField5 = new TextField();
        DatePicker datePicker2 = new DatePicker();
        TextField textField6 = new TextField();
        ComboBox comboBox2 = new ComboBox();
        ComboBox comboBox3 = new ComboBox();
        H3 h32 = new H3();
        FormLayout formLayout2Col2 = new FormLayout();
        TextField textField7 = new TextField();
        TextField textField8 = new TextField();
        ComboBox comboBox4 = new ComboBox();
        TextField textField9 = new TextField();
        DatePicker datePicker3 = new DatePicker();
        TextField textField10 = new TextField();
        H3 h33 = new H3();
        Grid basicGrid = new Grid(SamplePerson.class);
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Personal Information");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        textField.setLabel("First Name");
        textField2.setLabel("Last Name");
        datePicker.setLabel("Date of Birth");
        textField3.setLabel("Phone Number");
        emailField.setLabel("Email");
        textField4.setLabel("Occupation");
        comboBox.setLabel("ID Type");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        textField5.setLabel("IdsamplePerson Number");
        textField5.setWidth("min-content");
        datePicker2.setLabel("Date Settled");
        datePicker2.setWidth("min-content");
        textField6.setLabel("Stand Number");
        textField6.setWidth("min-content");
        comboBox2.setLabel("Ward");
        comboBox2.setWidth("min-content");
        setComboBoxSampleData(comboBox2);
        comboBox3.setLabel("Village");
        comboBox3.setWidth("min-content");
        setComboBoxSampleData(comboBox3);
        h32.setText("Next of Kin");
        h32.setWidth("768px");
        formLayout2Col2.setWidth("100%");
        textField7.setLabel("Full Name");
        textField7.setWidth("min-content");
        textField8.setLabel("Occupaton");
        textField8.setWidth("min-content");
        comboBox4.setLabel("ID Type");
        comboBox4.setWidth("min-content");
        setComboBoxSampleData(comboBox4);
        textField9.setLabel("IndsamplePerson Number");
        textField9.setWidth("min-content");
        datePicker3.setLabel("Date of Birth");
        datePicker3.setWidth("min-content");
        textField10.setLabel("Mobile Number");
        textField10.setWidth("min-content");
        h33.setText("Beneficiaries");
        h33.setWidth("768px");
        basicGrid.setWidth("100%");
        basicGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(basicGrid);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(textField3);
        formLayout2Col.add(emailField);
        formLayout2Col.add(textField4);
        formLayout2Col.add(comboBox);
        formLayout2Col.add(textField5);
        formLayout2Col.add(datePicker2);
        formLayout2Col.add(textField6);
        formLayout2Col.add(comboBox2);
        formLayout2Col.add(comboBox3);
        layoutColumn2.add(h32);
        layoutColumn2.add(formLayout2Col2);
        formLayout2Col2.add(textField7);
        formLayout2Col2.add(textField8);
        formLayout2Col2.add(comboBox4);
        formLayout2Col2.add(textField9);
        formLayout2Col2.add(datePicker3);
        formLayout2Col2.add(textField10);
        layoutColumn2.add(h33);
        layoutColumn2.add(basicGrid);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;
}
