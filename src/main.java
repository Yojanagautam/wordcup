import model.Group;
import model.Players;
import model.Teams;

import java.util.ArrayList;

public class main {
        public static void main(String[] args) {
            ArrayList<Players> englandList=new ArrayList<Players>();
            ArrayList<Players> germanList=new ArrayList<Players>();
            ArrayList<Players> brazilList=new ArrayList<Players>();
            Players p1=new Players("Neymar",12,31,10);
            Players p2=new Players("Messi",10,36,9);
            Players p3=new Players("Ronaldo",10,40,9);
            Players p4=new Players("hello",20,70,9);
            Players p5=new Players("pele",10,40,9);
            Players p6=new Players("Ronaldo",10,40,9);
            Players p7=new Players("Ronaldo",10,40,9);
            Players p8=new Players("Ronaldo",10,40,9);
            Players p9=new Players("Ronaldo",10,40,9);
            Players p10=new Players("pele",10,40,9);
            Players p11=new Players("Ronaldo",10,40,9);
            Players p12=new Players("Ronaldo",10,40,9);


            germanList.add(p5);
            germanList.add(p6);
            germanList.add(p7);
            germanList.add(p8);
            brazilList.add(p1);
            brazilList.add(p2);
            brazilList.add(p3);
            brazilList.add(p4);
            englandList.add(p9);
            englandList.add(p10);
            englandList.add(p11);
            englandList.add(p12);

            ArrayList<Group> groupList=new ArrayList<Group>();
            Group g1=new Group("Brazil");
            Group g2=new Group("Argentina");
            Group g3=new Group("Portugal");
            groupList.add(g1);
            groupList.add(g2);
            groupList.add(g3);
            System.out.println(groupList);
            ArrayList<Teams> TeambrazilList=new ArrayList<Teams>();


           Teams german=new Teams(germanList,"Argentina","white",12);
            Teams brazil=new Teams(brazilList,"Argentina","white",12);

            Teams  england=new Teams(englandList,"Portugal","blue",22);




        }
    }

