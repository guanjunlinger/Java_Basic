package com.io.document.xml.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("UserName1", 2018, "SuperMan", new Date());
        List<Menu> list1 = new ArrayList<>();
        Menu menu1 = new Menu("SystemManage", "1111");
        Menu child1 = new Menu("AuthorManage", "2222");
        Menu child2 = new Menu("UserManage", "3333");
        list1.add(child1);
        list1.add(child2);
        menu1.setChild(list1);

        List<Menu> list2 = new ArrayList<>();
        Menu menu2 = new Menu("SystemManage", "4444");
        Menu child3 = new Menu("AuthorManage", "5555");
        Menu child4 = new Menu("UserManage", "6666");
        list2.add(child3);
        list2.add(child4);
        menu2.setChild(list2);

        List<Menu> menus = new ArrayList<>();
        menus.add(menu1);
        menus.add(menu2);

        user.setMenu(menus);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(user, System.out);
        } catch (JAXBException e) {
            System.out.println(e);
        }
    }
}
