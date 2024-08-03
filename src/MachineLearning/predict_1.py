import numpy as np
import pandas as pd
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Load the data
path = 'C:/Users/Naga umesh/Downloads/cost.csv'
data = pd.read_csv(path)

# Handle null values if any
data = data.dropna()

# Create a time-based index as the feature
data['time'] = np.arange(len(data))

# Prepare the data
X = data[['time']]
y = data['cost']

# Split the data into training and test sets
X_train = X
y_train = y

# Train the model
model = LinearRegression()
model.fit(X_train, y_train)

# Predict the next 20 values
last_time_index = X_train['time'].max()
future_times = np.arange(last_time_index + 1, last_time_index + 21).reshape(-1, 1)
future_predictions = model.predict(future_times)

# Print next 20 predicted values
print("Next 20 predicted values:", future_predictions)
