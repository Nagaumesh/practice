import numpy as np
import pandas as pd

# how to create a dataset

# Step 1: Generate sample dataset
np.random.seed(42)
# x = np.random.randint(0,10,100)
# y = np.random.uniform(0,10,100)
x = np.random.normal(0,10,100)
# noise = np.random.randn(100) * 0.1
# z = 3 * x + 2 * y + noise
path = 'C:/Users/Naga umesh/Downloads/cost.csv'

# step 2: Create a DataFrame
data = pd.DataFrame({'x': x})
# data = pd.DataFrame({'x': x, 'y': y, 'z': z})

data.to_csv(path, index=False)  # Save the DataFrame to a CSV file
print("file created in"+path)