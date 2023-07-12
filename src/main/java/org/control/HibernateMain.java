package org.control;

import org.CodeForPizza.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {

        //Setup session factory
        try {
            Configuration cfg = new Configuration().configure();
            cfg.addAnnotatedClass(org.CodeForPizza.Player.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
            SessionFactory sf = cfg.buildSessionFactory(builder.build());

            //Create session
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            //Player player = new Player(1, "John", "Team1", 20);
            //Player player2 = new Player(2, "John2", "Team2", 21);
            Player player3 = new Player(3, "John3", "Team3", 22);
            //session.save(player);
            //session.save(player2);
            session.save(player3);
            tx.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
