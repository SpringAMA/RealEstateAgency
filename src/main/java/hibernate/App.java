package hibernate;

import hibernate.mapping.Photo;
import hibernate.mapping.Realty;
import hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Maks on 24.06.2016.
 */
public class App {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        Realty realty1 = new Realty(120, 50, 20, 4, 5, "description");

        session.save(realty1);

        Photo ph1 = new Photo(1, realty1);
        Photo ph2 = new Photo(2, realty1);
        Photo ph3 = new Photo(3, realty1);

        session.save(ph1);
        session.save(ph2);
        session.save(ph3);

        session.getTransaction().commit();
        session.close();
    }
}
