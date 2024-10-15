# BMI Calculator in JavaFX

This Java project implements a simple **BMI (Body Mass Index) Calculator** using JavaFX. The calculator allows users to input their height and weight, select the measurement system (Metric or English), and view their BMI category in real-time.

## Table of Contents
- [Project Description](#project-description)
- [Features](#features)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Example Output](#example-output)

## Project Description

The **BMI Calculator** provides a user-friendly interface for calculating BMI. Users can input their height and weight in their preferred measurement system:
- **Metric**: Height in centimeters (cm) and weight in kilograms (kg).
- **English**: Height in inches and weight in pounds (lb).

The BMI is automatically calculated as the user updates the input values, and the result is displayed along with a category (e.g., "Normal", "Underweight").

## Features

- **Two Measurement Systems**: Supports both Metric and English measurement units.
- **Automatic Calculation**: Real-time BMI calculation as inputs change.
- **BMI Categories**: Classifies BMI into:
  - Underweight
  - Normal
  - Overweight
  - Obese
- **User-Friendly UI**: Built using JavaFX with an intuitive layout.


## Requirements

- Java Development Kit (JDK) version 8 or later.
- JavaFX SDK.
- IDE like IntelliJ IDEA, Eclipse, or any JavaFX-compatible IDE.


## Running the Application

1. Open the project in your preferred IDE.
2. Run the `HelloApplication.java` file.
3. The JavaFX window will open with the BMI calculator interface.

## Usage

### Input Height and Weight:
- **Enter your height** in the appropriate text field:
  - **Metric**: Height in centimeters (e.g., `170` cm)
  - **English**: Height in inches (e.g., `68` inches)

- **Enter your weight** in the corresponding text field:
  - **Metric**: Weight in kilograms (e.g., `65` kg)
  - **English**: Weight in pounds (e.g., `150` lbs)

### Select Measurement System:
- Choose **Metric** or **English** from the `ChoiceBox`.

### View Results:
- The BMI is calculated automatically as you update the height and weight fields.
- The result will show the corresponding category (e.g., `"Normal"`).

## Example Output

- **Metric System**:
  - **Input**: Height `170` cm, Weight `65` kg.
  - **Output**: `Normal`

- **English System**:
  - **Input**: Height `68` inches, Weight `150` lbs.
  - **Output**: `Normal`
