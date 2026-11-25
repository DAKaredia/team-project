# Work in progress
## Team Information
### Team Members
- Mandon Kahn
- Arjun Alwe
- Dayyan Karedia
---
## Project Description
### Music
"This project is a music recommendation app, to help users explore new music and better understand their preferences.
This app allows users to search for songs, and discover music simillar to their taste, using the recommendation functionality. This app also provides breakdowns of playlists based on genre and artists, allowing users to better understand their taste.
Lastly, users will be able to export playlists they create or discover directly to their Spotify accounts, making it easier to access and listen to their music."

---
### User Stories
- As a user, I want to be able to search for songs so I can discover new music.

- As a user, I want to be able to find other songs similar to those I like so I can expand my music taste.

- As a user, I want to be able to get a breakdown of any collections of songs (playlist or liked songs) by genre or by artist so I can analyze it. 

- As a user, I want to be able to export playlists to Spotify so I can listen to them.

---
## Use Cases
### Login
*Primary Actor:* User

*Precondtions:* The user has an existing account or a Spotify account that can be used for authentication.

*Trigger:* The user selects the Login option.

*Success Outcome:* The user is successfully authenticated and gains access to the application.

*Main Success Scenario:*
1. The user opens the application.
2. The user selects Login.
3. The application prompts the user to authenticate.
4. The user provides their credentials or authenticates through Spotify.
5. The application verifies the user's authentication.
6. The application redirects the user to the main interface.

*Extensions:*
- 4a. The user enters incorrect credentials. The application displays an error and prompts the user to try again. 
- 4b. The user cancels the authentication process. The application returns to the login screen.


### Logout
*Primary Actor:* User

*Preconditions:*

- The user is currently logged in.

*Trigger:*

- The user selects the Logout option.

*Success Outcome:*

- The user's session is terminated, and they are returned to the login screen.

*Main Success Scenario:*
1. The user selects Logout.
2. The application terminates the user's session.
3. The application clears the user's session information.
4. The application redirects the user to the login screen.

*Extensions:*
- 2a. An error occurs while terminating the session. The application displays an error and allows the user to retry.

### Import Liked Songs
*Primary Actor:* User

*Preconditions:*
- The user is logged in.
- The user has connected their Spotify account.
- The user has granted the necessary permissions to access their liked songs.
  
*Trigger:*

- The user selects Import Liked Songs.

*Success Outcome:*

- The user's liked songs are retrieved from Spotify and made accessible within the application.

*Main Success Scenario:*
1. The user navigates to the music library.
2. The user selects Import Liked Songs.
3. The application sends a request to the Spotify API.
4. Spotify returns the user's liked songs.
5. The application processes and stores the retrieved song information.
6. The application displays the imported songs to the user.

*Extensions:*
- 3a. The user's Spotify account is not connected. The application prompts the user to connect their account.
- 3b. The user has not granted the necessary permissions. The application requests authorization.
- 4a. The user has no liked songs. The application informs the user that their collection is empty.
- 4b. The Spotify API request fails. The application displays an error and allows the user to retry.

### Search for Songs
**Primary Actor:** User

**Preconditions:**
- The application is running.
- The user has access to the search functionality.
  
**Trigger:**

- The user enters a search query.

**Success Outcome:**

- The application displays songs matching the user's search query.

**Main Success Scenario:**
1. The user opens the search feature.
2. The user enters a song title, artist name, or keyword.
3. The application sends the search query to the Spotify API.
4. Spotify returns matching songs.
5. The application processes the search results.
6. The application displays the matching songs, including their titles, artists, and album information.
   
**Extensions:**
- 2a. The user enters an empty search query. The application prompts the user to enter a search term.
- 4a. No matching songs are found. The application informs the user and suggests trying another query.
- 4b. The Spotify API request fails. The application displays an error and allows the user to retry.

### Generate Personalized Playlist
Primary Actor: User

Preconditions:
- The user is logged in.
- The application has access to the user's liked songs or music preferences.
- There is sufficient song information available to generate recommendations.
  Trigger:

- The user selects Generate Personalized Playlist.

Success Outcome:

- The application generates and displays a playlist containing songs recommended based on the user's music preferences.

Main Success Scenario:
1. The user opens the personalized playlist feature.
2. The application retrieves the user's liked songs and music preferences.
3. The application analyzes the user's music collection to identify listening preferences.
4. The application identifies songs that are similar to the user's existing music.
5. The application generates a personalized playlist using the recommended songs.
6. The application displays the generated playlist to the user.
7. The user can apply filters, such as genre or artist, to refine the recommendations.
8. The application updates the playlist based on the selected filters.
   Extensions:
- 2a. The user has not imported their liked songs. The application prompts the user to import their collection.
- 3a. There is insufficient information to determine the user's preferences. The application prompts the user to provide more songs or preferences.
- 4a. No suitable recommendations are found. The application informs the user and suggests modifying their preferences.
- 7a. The selected filters produce no matching songs. The application informs the user and allows them to modify the filters.

### Analyze Playlist
**Primary Actor:** User

**Preconditions:**
- The user is logged in.
- At least one playlist or music collection is available for analysis.
- The application has access to the song information within the selected collection.
  
**Trigger:**

- The user selects a playlist and chooses the Analyze Playlist option.

**Success Outcome:**

- The application displays a breakdown of the selected playlist by genre and artist.

**Main Success Scenario:**
1. The user navigates to their music collections.
2. The user selects a playlist or their liked songs.
3. The user selects the Analyze Playlist option.
4. The application retrieves the songs within the selected collection.
5. The application gathers relevant song and artist information.
6. The application groups the songs by genre and artist.
7. The application calculates the distribution of songs within each category.
8. The application displays the results using statistics, charts, or graphs.
   
**Extensions:**
- 2a. The selected playlist is empty. The application informs the user that there are no songs to analyze.
- 4a. Some song information is unavailable. The application analyzes the available information and indicates any missing data.
- 5a. Genre information is unavailable for some songs. The application excludes those songs from the genre breakdown.

### Export Playlist to Spotify
**Primary Actor:** User

**Preconditions:**
- The user is logged in.
- The user has connected their Spotify account.
- The user has granted the necessary permissions to create and modify playlists.
- A playlist containing at least one song is available for export.
  
**Trigger:**

- The user selects a playlist and chooses Export to Spotify.

**Success Outcome:**

- The selected playlist is successfully created in the user's Spotify account with its available songs.

**Main Success Scenario:**
1. The user selects a playlist they want to export.
2. The user selects Export to Spotify.
3. The application verifies the user's Spotify authorization.
4. The application creates a new playlist in the user's Spotify account.
5. The application retrieves the Spotify identifiers for the songs in the selected playlist.
6. The application adds the songs to the newly created Spotify playlist.
7. The application confirms that the export was successful.
   
**Extensions:**
- 3a. The user has not connected their Spotify account. The application prompts them to authenticate.
- 3b. The user has not granted the necessary permissions. The application requests authorization.
- 5a. Some songs cannot be found on Spotify. The application informs the user and allows the export to continue with the available songs.
- 6a. An error occurs while adding songs. The application displays an error and allows the user to retry.
---
## Minimal Viable Product (MVP)
| Team Member | MVP Use Case |
|-------------|--------------|
| Mandon Kahn | Use Case 1 |
| Mandon Kahn | Use Case 2|
| Dayyan Karedia | Use Case 3|
| Mandon Kahn | Use Case 4|
| Arjun Alwe | Use Case 5|
| | Use Case 6|
| Dayyan Karedia | Use Case 7|
---
## Entities
### Entity 1
### Entity 2
(Add additional entities as needed.)
---
### API Usage
**API Name:** Spotify Web API

**Documentation:** [ https://developer.spotify.com/documentation/web-api ]

**How it is used in the program:** The Spotify Web API will be used to retrieve music information, access user playlists and liked songs, and export playlists to Spotify.

---
## Design Diagrams
### UML Class Diagram
### Sequence Diagrams
---
## How to Run

---
## Notes
[Any addi
