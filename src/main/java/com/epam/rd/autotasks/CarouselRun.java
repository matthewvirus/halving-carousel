package com.epam.rd.autotasks;

public class CarouselRun {

    int position = 0;
    int[] decrementingArray = DecrementingCarousel.carouselArray;


    public int next() {
        int count = 0;
        while (count < decrementingArray.length && decrementingArray[position %= decrementingArray.length] <= 0) {
            position++;
            count++;
        }
        if (count == decrementingArray.length) return -1;
        return decrementingArray[position++]--;
    }

    public boolean isFinished() {
        for (int var: decrementingArray) {
            if (var > 0) return false;
        }
        return true;
    }

}