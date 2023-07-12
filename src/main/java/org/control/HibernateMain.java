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

            //Create player and insert into database
            //Player player = new Player(1, "John", "Team1", 20);
            //Player player2 = new Player(2, "John2", "Team2", 21);
            //Player player3 = new Player(3, "John3", "Team3", 22);
            //session.save(player);
            //session.save(player2);
            //session.save(player3);

            //Get player from database
            //Player player = session.get(Player.class, 1);
            //System.out.println("playerinfo " + player.toString());

            //Update fetched player
            //player.setPlayerName("Amir");
            //player.setPlayerage(39);
            //session.update(player);

            //Delete fetched player
            //session.delete(player);

            //add players with auto increment id
            Player player4 = new Player("Kalle", "Team4", 34);
            Player player5 = new Player("pelle", "Team5", 78);
            session.save(player4);
            session.save(player5);
            //Commit transaction and close session
            tx.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
