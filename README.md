# CV Parsing Application

This project aims to develop a CV Parsing application using Java Fullstack technologies. The application will extract specific fields from Word/PDF format CVs, including Name, Email ID, Mobile No., Skills, Years of Experience, and Recent 3 Companies.

## Requirements

### Backend Development

- Accept Word/PDF format CV files as input.
- Implemented a parser to extract information from the CV files.
- Extract the following fields from each CV:
  - Name (string): The name of the candidate.
  - Email ID (string): The email address of the candidate.
  - Mobile No. (string): The mobile number of the candidate.
  - Skills (string or array): The skills possessed by the candidate.
  - Years of Experience (number): The number of years of experience of the candidate.
  - Recent 3 Companies (string or array): The names of the recent 3 companies the candidate has worked for.
- Store the extracted information in a database for further processing.
- Implement validation and error handling in the backend.

### Frontend Development

- Create a user interface using a react framework and bootstrap CSS framework
- Implement a drag and drop form input that allows CV in word document or PDF format to be uploaded by users.
- Display the extracted information for each CV, including the fields mentioned above. Allow users to update extracted fields if incorrect.
- Provide search functionality to find candidates based on their name or skills.
- Utilize form validation to ensure correct file formats (Word/PDF) are uploaded.

### Integration

- Connect the frontend and backend by making API calls from the frontend to send CV files and retrieve extracted information.
- Implement error handling and display appropriate error messages to the user when necessary.
- Ensure data consistency between the frontend and backend.

### Features
- Applications accepts 3 roles
  - Free role
    - As a free subscriber to the application, user can upload a maximum of 5 CV to be parsed.
  - Paid role
    - As a paid subscriber to the application, user can upload unlimited number of CVs to be parsed. User can view all his CVs, filter them based on name or skills. User also have the options to export filtered data to excel or single resume details to excel for further processing.

### Additional Features (optional)

- Implement a feature to export the extracted information to a CSV or Excel file.
- Provide visualizations or statistics based on the extracted data, such as skills distribution or years of experience breakdown.

## Installation and Setup

To set up the CV Parsing application, follow these steps:

1. Clone the repository to your local machine.
2. Install the required dependencies for the frontend and backend components.
3. Set up the backend by configuring the database connection and server settings.
4. Set up the frontend by configuring the API endpoint and any additional settings.
5. Build the project to compile the source code and generate the necessary files.
6. Deploy the application to a suitable hosting environment or run it locally for development and testing purposes.

Please refer to the project's documentation for detailed installation and setup instructions specific to your chosen technologies.

## Usage

Once the application is set up, follow these steps to use the CV Parsing application:

1. Access the application through a web browser.
2. Upload a Word/PDF format CV file using the provided form.
3. The application will process the file and extract the relevant information.
4. The extracted information will be displayed on the user interface.
5. Use the search functionality to find candidates based on their name or skills.
6. Explore any additional features, such as exporting the data or viewing visualizations.

## Contributing

Contributions to this project are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository and create a new branch for your contribution.
2. Make your changes, addressing any identified issues or adding new features.
3. Test your changes thoroughly.
4. Create a pull request, explaining your changes and any related information.

Please ensure that your contributions align with the project's coding conventions, guidelines, and licensing requirements.
