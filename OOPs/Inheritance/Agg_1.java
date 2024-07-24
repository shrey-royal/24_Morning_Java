/*
Music - Analyzing Playlist Engagement Across Users

Problem Statement:
You have data from multiple users who have created playlists with various popular songs. Each song in a playlist has a play count, and you need to determine which song has the highest overall engagement across all playlists and users. Additionally, identify which playlist contains the song with the highest engagement and calculate the total play count for that playlist.

Sample Input:
// Data structure to represent the song play counts in different playlists
class Playlist {
    String playlistName;
    String[] songs;
    int[] playCounts;
    
    Playlist(String name, String[] songs, int[] playCounts) {
        this.playlistName = name;
        this.songs = songs;
        this.playCounts = playCounts;
    }
}

// Create sample playlists
Playlist[] playlists = {
    new Playlist("Chill Vibes", new String[]{"Blinding Lights", "Watermelon Sugar", "Levitating"}, new int[]{1500, 2000, 1200}),
    new Playlist("Workout Hits", new String[]{"Watermelon Sugar", "Save Your Tears", "Levitating"}, new int[]{2500, 1800, 2200}),
    new Playlist("Top 40", new String[]{"Blinding Lights", "Levitating", "Good 4 U"}, new int[]{3000, 2200, 1500}),
    new Playlist("Indie Favorites", new String[]{"Levitating", "Good 4 U", "drivers license"}, new int[]{2000, 1700, 2500})
};


Sample Output:
Overall Most Engaged Song: Blinding Lights with 4500 total plays

Playlist Containing the Most Engaged Song:
Playlist: Top 40
Total Play Count: 5700

Explanation:

1. Calculate Total Plays for Each Song:
   - Blinding Lights: 1500 (Chill Vibes) + 0 (Workout Hits) + 3000 (Top 40) + 0 (Indie Favorites) = 4500
   - Watermelon Sugar: 2000 (Chill Vibes) + 2500 (Workout Hits) + 0 (Top 40) + 0 (Indie Favorites) = 4500
   - Levitating: 1200 (Chill Vibes) + 2200 (Workout Hits) + 2200 (Top 40) + 2000 (Indie Favorites) = 7600
   - Save Your Tears: 0 (Chill Vibes) + 1800 (Workout Hits) + 0 (Top 40) + 0 (Indie Favorites) = 1800
   - Good 4 U: 0 (Chill Vibes) + 0 (Workout Hits) + 1500 (Top 40) + 1700 (Indie Favorites) = 3200
   - drivers license: 0 (Chill Vibes) + 0 (Workout Hits) + 0 (Top 40) + 2500 (Indie Favorites) = 2500

2. Find the Most Engaged Song:
   - Levitating has the highest total play count of 7600.

3. Find the Playlist Containing the Most Engaged Song:
   - Song Levitating is in the "Top 40" playlist with a total play count of 5700 (sum of all songs in the playlist).

*/

class Playlist {
    String playlistName;
    String[] songs;
    int[] playCounts;
    
    Playlist(String name, String[] songs, int[] playCounts) {
        this.playlistName = name;
        this.songs = songs;
        this.playCounts = playCounts;
    }
}

public class Agg_1 {
    public static void main(String[] args) {
        Playlist[] playlists = {
            new Playlist("Chill Vibes", new String[]{"Blinding Lights", "Watermelon Sugar", "Levitating"}, new int[]{1500, 2000, 1200}),
            new Playlist("Workout Hits", new String[]{"Watermelon Sugar", "Save Your Tears", "Levitating"}, new int[]{2500, 1800, 2200}),
            new Playlist("Top 40", new String[]{"Blinding Lights", "Levitating", "Good 4 U"}, new int[]{3000, 2200, 1500}),
            new Playlist("Indie Favorites", new String[]{"Levitating", "Good 4 U", "drivers license"}, new int[]{2000, 1700, 2500})
        };

        findMostEngagedSongs(playlists);

        findPlaylistWithMostEngagedSong(playlists);
    }

    public static void findMostEngagedSongs(Playlist[] playlists) {
        String[] allSongs = new String[100];
        int[] totalPlays = new int[100];
        int songCount = 0;

        for (Playlist playlist : playlists) {
            for (int i = 0; i < playlist.songs.length; i++) {
                String song = playlist.songs[i];
                int plays = playlist.playCounts[i];
                boolean found = false;

                for (int j = 0; j < songCount; j++) {
                    if(allSongs[j].equals(song)) {
                        totalPlays[j] += plays;
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    allSongs[songCount] = song;
                    totalPlays[songCount] = plays;
                    songCount++;
                }
            }
        }

        // for (int i = 0; i < songCount; i++) {
        //     System.out.println("Name: " + allSongs[i] + ",\tTotal Plays: " + totalPlays[i]);
        // }

        int maxPlays = 0;
        String mostEngagedSong = "";
        for (int i = 0; i < songCount; i++) {
            if(totalPlays[i] > maxPlays) {
                maxPlays = totalPlays[i];
                mostEngagedSong = allSongs[i];
            }
        }

        System.out.println("Overall Most Engaged Song: " + mostEngagedSong + " with " + maxPlays + " total plays");
    }

    public static void findPlaylistWithMostEngagedSong(Playlist[] playlists) {
        int[] maxPlayCount = new int[100];
        int idx = 0, bestPlaylistCount = 0;
        String bestPlaylist = "";

        for (Playlist playlist : playlists) {
            int playlistPlayCount = 0;
            for (int i = 0; i < playlist.playCounts.length; i++) {
                playlistPlayCount += playlist.playCounts[i];
            }
            maxPlayCount[idx++] = playlistPlayCount;
        }

        for (int i = 0; i < idx; i++) {
            if(bestPlaylistCount < maxPlayCount[i]) {
                bestPlaylistCount = maxPlayCount[i];
                bestPlaylist = playlists[i].playlistName;
            }
        }
        System.out.println("Playlist Containing the Most Engaged Song:");
        System.out.println("Playlist: " + bestPlaylist);
        System.out.println("Total Play Count: " + bestPlaylistCount);
    }
}
