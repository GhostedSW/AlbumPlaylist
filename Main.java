package Musics;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Rap God","Montana of 300");
        album.addSong( "Rap God",6.31);
        album.addSong("The Last Dance ",4.36);
        album.addSong( "OMG",5.31);
        album.addSong( "Proud of my pain",3.41);
        album.addSong( "Fendi",3.43);
        album.addSong( "Know my pain",3.46);
        album.addSong( "Mama",3.59);
      albums.add(album);

album = new Album("The Butterfly Effect","Fetty Wap");
        album.addSong( "The Truth",2.22);
        album.addSong("Remember me ",1.43);
        album.addSong( "Talk my Shit",2.35);
        album.addSong( "My Moment",2.26);
      albums.add(album);

        LinkedList<Song> FirstPlayList = new LinkedList<>();
        albums.get(0).addToPLayList("Rap God", FirstPlayList);
        albums.get(1).addToPLayList("The Last Dance", FirstPlayList);
        albums.get(5).addToPLayList("Know my pain", FirstPlayList);
        albums.get(6).addToPLayList("Mama", FirstPlayList);
        albums.get(3).addToPLayList("My Moment", FirstPlayList);
        albums.get(0).addToPLayList("The Truth", FirstPlayList);
        albums.get(1).addToPLayList("Remember Me ", FirstPlayList);

  play(FirstPlayList);
    }
private  static  void play(LinkedList<Song> PlayList){
    Scanner scanner = new Scanner(System.in);
boolean quit = false;
boolean forward = true;
    ListIterator<Song> listIterator = PlayList.listIterator();
    if (PlayList.size() == 0){
        System.out.println("This playlist is empty");
    }else {
        System.out.println("Now playing" + listIterator.next().toString());
    printMenu();
    }
while (!quit){
    int action = scanner.nextInt();
    scanner.nextLine();
    switch (action){
        case 0:
            System.out.println("Playlist complete");
            quit = true;
            break;

        case 1:
            if (!forward){
if (listIterator.hasNext()){
    listIterator.next();
}
            forward = true;
            }
    if (listIterator.hasNext()){
        System.out.println("Now playing" + listIterator.next().toString());
    }else {
        System.out.println("no song available,reached to the end of the list");
   forward = false;
    }
    break;
        case 2:
            if (forward){
                if (listIterator.hasPrevious()){
                    listIterator.previous();
                }
            forward = false;

            }
if (listIterator.hasPrevious()){
    System.out.println("Now playing" + listIterator.previous().toString());
}else {
    System.out.println("we are at the first song");
    forward= false;

}
   break;

        case 3:
            if (forward){
                if (listIterator.hasPrevious()){
                    System.out.println("Now playing" + listIterator.previous().toString());
                forward = false;
                }else{
                    System.out.println("we are at the start of the list");
                }
            }else {
                if (listIterator.hasNext()){
                    System.out.println("Now playing" + listIterator.next().toString());
                forward = true;
                }else {
                    System.out.println("we have reached to the end of list");
                }
            }
    break;
        case 4:
            printList(PlayList);
            break;
        case 5:
            printMenu();
            break;
        case 6:
            if (PlayList.size() > 0 ){
                listIterator.remove();
                if (listIterator.hasNext()){
                    System.out.println("Now playing" + listIterator.next().toString());
                    forward = true;
                }else {
                    if (listIterator.hasPrevious())
                    System.out.println("now playing " + listIterator.previous().toString());
                }
            }
    }
}


    }

private static void printMenu(){
    System.out.println("Available options\n press");
    System.out.println("0 - to quit\n"+
            "1 - to play next song\n"+
            "2 - to play previous  song\n"+
            "3 - to replay the current song\n"+
            "4 - list of all the songs\n"+
            "5 - print all available songs\n"+
            "6 - delete current song");
    }

private static  void printList(LinkedList<Song> playList){
    Iterator<Song> iterator = playList.iterator();
    System.out.println("--------------------");

    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
    System.out.println("--------------------");
    }












}
