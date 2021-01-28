from math import sqrt

def rmse_metric(actual,predicted):
    sum_error=0.0
    for i in range(len(actual)):
        predicted_error=predicted[i]-actual[i]
        sum_error=sum_error+(predicted_error**2)
    mean_error=sum_error/len(actual)
    return sqrt(sum_error)


def evaluate_algorithm(dataset,algorithm):
    test_set=[]
    for i in dataset:
        row_copy=list(i)
        row_copy[-1]=None
        test_set.append(row_copy)
    predicted=algorithm(dataset,test_set)
    print(predicted)
    actual=[row[-1] for row in dataset]
    rmse=rmse_metric(actual,predicted)
    return rmse



def mean(values):
    return sum(values)/len(values)

def variance(values,mean):
    return sum([(x-mean)**2 for x in values])

def covariance(x,mean_x,y,mean_y):
    cv=0.0
    for i in range(len(x)):
        cv=cv+((x[i]-mean_x)*(y[i]-mean_y))
    return cv


def coefficients(dataset):
    x=[row[0] for row in dataset]
    y=[row[1] for row in dataset]
    mean_x,mean_y=mean(x),mean(y)
    b1=covariance(x,mean_x,y,mean_y)/variance(x,mean_x)
    b0=mean_y-b1*mean_x
    return [b0,b1]

def simple_linear_regression(train,test):
    predictions=[]
    b0,b1=coefficients(train)
    for row in test:
        ybar=b0+b1*row[0]
        predictions.append(ybar)
    return predictions




dataset = [[1, 1], [2, 3], [4, 3], [3, 2], [5, 5]]

rmse=evaluate_algorithm(dataset,simple_linear_regression)

print(rmse)