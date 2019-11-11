package objectsAndClasses_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Songs04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numSongs = Integer.parseInt(reader.readLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {
            String[] data = reader.readLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song(type, name, time);

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }
        String typeList = reader.readLine();
        if(typeList.equals("all")){
            for (Song song:songs) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song:songs) {
                if(song.getTime().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
            List<Song>filterSong = songs.stream().
                    filter(e->e.getTypeList().
                            equals(typeList)).
                    collect(Collectors.toList());
            for (Song song:filterSong) {
                System.out.println(song.getName());

            }
        }

    }

    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
/*⦁	Defining Simple Classes
⦁	Songs
Define a class Song, which holds the following information about songs: Type List, Name and Time.
On the first line you will receive the number of songs - N.
On the next N-lines you will be receiving data in the following format: "{typeList}_{name}_{time}".
On the last line you will receive Type List / "all". Print only the Names of the songs which are from that Type List / All songs.
Examples
Input
3
favourite_DownTown_3:14
favourite_Kiss_4:16
favourite_Smooth Criminal_4:01
favourite

Output
DownTown
Kiss
Smooth Criminal


Input
4
favourite_DownTown_3:14
listenLater_Andalouse_3:24
favourite_In To The Night_3:58
favourite_Live It Up_3:48
listenLater

Output
Andalouse


Input
2
like_Replay_3:15
ban_Photoshop_3:48
all

Output
Replay
Photoshop


Solution
Define class Song with fields: Type List, Name and Time.

Define getters and setters: use keys ALT + INS and generate Getter and Setter

Read the input lines, make collection and store the data.

Finally read your last line – Type List and print the result.

You can use Stream API to filter the collection.

*/