package hibernate;

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

        session.getTransaction().commit();
        session.close();
    }
}
