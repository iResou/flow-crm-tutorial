package com.example.application.views.list;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("list")
@Route(value = "")
public class ListView extends VerticalLayout
{

    public ListView()
    {
        Button botonPa = new Button("Clickeame");

        TextField Nombre= new TextField("Nombre");
        HorizontalLayout hl = new HorizontalLayout(Nombre,botonPa);
        hl.setDefaultVerticalComponentAlignment(Alignment.BASELINE);


        botonPa.addClickListener(ClickIzquierdo->Notification.show("Hola, "+Nombre.getValue()));
        add(hl);

    }

}
