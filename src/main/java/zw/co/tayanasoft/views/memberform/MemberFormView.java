package zw.co.tayanasoft.views.memberform;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.PropertyId;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import zw.co.tayanasoft.data.Member;
import zw.co.tayanasoft.data.Ward;
import zw.co.tayanasoft.services.MemberService;
import zw.co.tayanasoft.views.MainLayout;
import zw.co.tayanasoft.views.wards.WardsView;

@PageTitle("Member Form")
@Route(value = "member-form", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class MemberFormView extends Composite<VerticalLayout> {

    private Member member;

    private final BeanValidationBinder<Member> binder;
    public MemberFormView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        TextField firstName = new TextField();
        TextField lastName = new TextField();
        DatePicker dateOfBirth = new DatePicker();
        TextField phone = new TextField();
        EmailField email = new EmailField();
        TextField occupation = new TextField();
        ComboBox idType = new ComboBox();
        TextField identityNumber = new TextField();
        DatePicker dateSettled = new DatePicker();
        TextField standNumber = new TextField();
        ComboBox ward = new ComboBox();
        ComboBox village = new ComboBox();
        H3 h32 = new H3();
        FormLayout formLayout2Col2 = new FormLayout();
        TextField nkFullName = new TextField();
        TextField nkOccupation = new TextField();
        ComboBox nkIdType = new ComboBox();
        TextField nkIdentityNumber = new TextField();
        DatePicker nkDateOfBirth = new DatePicker();
        TextField nkMobileNumber = new TextField();
        H3 h33 = new H3();
        Grid basicGrid = new Grid(Member.class);
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button saveButton = new Button();
        Button cancelButton = new Button();
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
        firstName.setLabel("First Name");
        lastName.setLabel("Last Name");
        dateOfBirth.setLabel("Date of Birth");
        phone.setLabel("Phone Number");
        email.setLabel("Email");
        occupation.setLabel("Occupation");
        idType.setLabel("ID Type");
        idType.setWidth("min-content");
        setComboBoxSampleData(idType);
        identityNumber.setLabel("Identity Number");
        identityNumber.setWidth("min-content");
        dateSettled.setLabel("Date Settled");
        dateSettled.setWidth("min-content");
        standNumber.setLabel("Stand Number");
        standNumber.setWidth("min-content");
        ward.setLabel("Ward");
        ward.setWidth("min-content");
        setComboBoxSampleData(ward);
        village.setLabel("Village");
        village.setWidth("min-content");
        setComboBoxSampleData(village);
        h32.setText("Next of Kin");
        h32.setWidth("768px");
        formLayout2Col2.setWidth("100%");
        nkFullName.setLabel("Full Name");
        nkFullName.setWidth("min-content");
        nkOccupation.setLabel("Occupation");
        nkOccupation.setWidth("min-content");
        nkIdType.setLabel("ID Type");
        nkIdType.setWidth("min-content");
        setComboBoxSampleData(nkIdType);
        nkIdentityNumber.setLabel("Identity Number");
        nkIdentityNumber.setWidth("min-content");
        nkDateOfBirth.setLabel("Date of Birth");
        nkDateOfBirth.setWidth("min-content");
        nkMobileNumber.setLabel("Mobile Number");
        nkMobileNumber.setWidth("min-content");
        h33.setText("Beneficiaries");
        h33.setWidth("768px");
        basicGrid.setWidth("100%");
        basicGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(basicGrid);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        saveButton.setText("Save");
        saveButton.setWidth("min-content");
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        cancelButton.setText("Cancel");
        cancelButton.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(firstName);
        formLayout2Col.add(lastName);
        formLayout2Col.add(dateOfBirth);
        formLayout2Col.add(phone);
        formLayout2Col.add(email);
        formLayout2Col.add(occupation);
        formLayout2Col.add(idType);
        formLayout2Col.add(identityNumber);
        formLayout2Col.add(dateSettled);
        formLayout2Col.add(standNumber);
        formLayout2Col.add(ward);
        formLayout2Col.add(village);
        layoutColumn2.add(h32);
        layoutColumn2.add(formLayout2Col2);
        formLayout2Col2.add(nkFullName);
        formLayout2Col2.add(nkOccupation);
        formLayout2Col2.add(nkIdType);
        formLayout2Col2.add(nkIdentityNumber);
        formLayout2Col2.add(nkDateOfBirth);
        formLayout2Col2.add(nkMobileNumber);
        layoutColumn2.add(h33);
        layoutColumn2.add(basicGrid);
        layoutColumn2.add(layoutRow);
        layoutRow.add(saveButton);
        layoutRow.add(cancelButton);

        binder = new BeanValidationBinder<>(Member.class);
        //binder.bindInstanceFields(this);
        binder.bind(firstName, "firstName");
        binder.bind(lastName, "lastName");
        binder.bind(email, "email");
        binder.bind(phone,"phone");
        binder.bind(dateOfBirth, "dateOfBirth");
        binder.bind(occupation, "occupation");
        binder.bind(idType,"idType");
        binder.bind(identityNumber, "identityNumber");
        binder.bind(dateSettled, "dateSettled");
        binder.bind(ward, "ward");
        binder.bind(village, "village");
        binder.bind(nkFullName, "nkFullName");
        binder.bind(nkOccupation, "nkOccupation");
        binder.bind(nkIdType,"nkIdType");
        binder.bind(nkIdentityNumber, "nkIdentityNumber");
        binder.bind(nkDateOfBirth, "nkDateOfBirth");
        binder.bind(nkMobileNumber, "nkMobileNumber");

        saveButton.addClickListener(e -> {
            try{
                if(this.member == null){
                    this.member = new Member();
                }
                binder.writeBean(this.member);
                memberService.update(this.member);
                clearForm();
                refreshGrid();
                Notification.show("Data updated");
                UI.getCurrent().navigate(WardsView.class);
            }catch (ObjectOptimisticLockingFailureException exception) {
                Notification n = Notification.show(
                        "Error updating the data. Somebody else has updated the record while you were making changes.");
                n.setPosition(Notification.Position.MIDDLE);
                n.addThemeVariants(NotificationVariant.LUMO_ERROR);
            } catch (ValidationException validationException) {
                Notification.show("Failed to update the data. Check again that all values are valid");
            }
        });
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
        grid.setItems(query -> memberService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    private void refreshGrid() {
        //grid.select(null);
        //grid.getDataProvider().refreshAll();
    }

    private void clearForm() {
        populateForm(null);
    }

    private void populateForm(Member value) {
        this.member = value;
        binder.readBean(this.member);

    }
    @Autowired()
    private MemberService memberService;
}
