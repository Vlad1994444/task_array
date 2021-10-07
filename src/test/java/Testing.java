import com.vladislav.taskOne.service.actions.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Testing {

    Sum sum;
    Average average;
    MinAndMax minAndMax;
    GetNumbersBetween_A_And_B getNumbersBetween_a_and_b;
    CountOfPositiveAndNegative countOfPositiveAndNegative;
    double[]doubles;

    @Before
    public void creation(){
        sum = new Sum();
        average = new Average();
        minAndMax = new MinAndMax();
        getNumbersBetween_a_and_b = new GetNumbersBetween_A_And_B();
        countOfPositiveAndNegative = new CountOfPositiveAndNegative();

        doubles = new double[]{12.4, 45.5, 0.45, -1.54};

    }

    @Test
    public void sum_test(){
        Assert.assertEquals(sum.sum(doubles), "Sum of all numbers in array is equal to 56,81");
    }
    @Test
    public void average_test(){
        Assert.assertEquals(average.averageOfArray(doubles), "Average number in array is 14,2");
    }
    @Test
    public void min_max_values_test(){
        Assert.assertEquals(minAndMax.findMinAndMax(doubles), "Min value -1.54, max value 45.5");
    }
    @Test
    public void get_number_between_a_and_b_test(){
        Assert.assertEquals(getNumbersBetween_a_and_b.change(doubles, 0,6),
                "Numbers from array between 0.0 and 6.0 : 0.45 ");
    }
    @Test
    public void count_number_of_positive_and_negative_numbers_test(){
        Assert.assertEquals(countOfPositiveAndNegative.positiveAndNegative(doubles),
                "Amount of positive numbers - 3. Amount of negative numbers - 1");
    }
}
