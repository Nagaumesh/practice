import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

# Define file paths
data_csv_path = 'C:/Users/Naga umesh/Downloads/datacsv.csv'
test_csv_path = 'C:/Users/Naga umesh/Downloads/testcsv.csv'
predicted_test_csv_path = 'C:/Users/Naga umesh/Downloads/predicted_testcsv.csv'

# # Step 1: Generate sample dataset
# np.random.seed(42)
# x = np.random.rand(100)
# y = np.random.rand(100)
# noise = np.random.randn(100) * 0.1
# z = 3 * x + 2 * y + noise

# # Create a DataFrame
# data = pd.DataFrame({'x': x, 'y': y, 'z': z})
# data.to_csv(data_csv_path, index=False)  # Save the DataFrame to a CSV file

# Step 2: Load the data
data = pd.read_csv(data_csv_path)  # Read the CSV file

# Step 3: Split the data into training and test sets
X = data[['x', 'y']]
y = data['z']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Step 4: Train a linear regression model
model = LinearRegression()
model.fit(X_train, y_train)

# Step 5: Predict z for the test set
y_pred = model.predict(X_test)

# Evaluate the model
mse = mean_squared_error(y_test, y_pred)
print(f'Mean Squared Error: {mse}')

# # Step 6: Predict z for new data
# new_test_data = pd.DataFrame({'x': np.random.rand(10), 'y': np.random.rand(10)})
# new_test_data.to_csv(test_csv_path, index=False)  # Save the new test DataFrame to a CSV file

# Load the new test data
new_test_data = pd.read_csv(test_csv_path)

# Predict z for the new test data
new_test_predictions = model.predict(new_test_data)

# Add predictions to the new test data
new_test_data['z_pred'] = new_test_predictions

# Save the predictions to a new CSV file
new_test_data.to_csv(predicted_test_csv_path, index=False)
print(f'Predictions saved to {predicted_test_csv_path}')
