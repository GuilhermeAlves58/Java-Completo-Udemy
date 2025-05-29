package secao12.application;

import secao12.entitiesExer02.Comment;
import secao12.entitiesExer02.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exer02 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment comment00 = new Comment("Have a nice trip");
        Comment comment01 = new Comment("Wow,that's awesome");
        Comment comment02 = new Comment("Good night");
        Comment comment03 = new Comment("May the force be with you");
        Post post00 = new Post(format.parse("21/06/2018 13:05:44"),"Traveling to New Zealand","I'm going to visit this wonderful country!",12);
        Post post01 = new Post(format.parse("28/07/2018 23:14:19"),"Good night guys","See you tomorrow",5);

        post00.addComments(comment00);
        post00.addComments(comment01);

        post01.addComments(comment02);
        post01.addComments(comment03);

        System.out.println(post00);
        System.out.println(post01);
    }
}
