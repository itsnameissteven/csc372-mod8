package student_roll;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeSort  {
  Comparator<Student> comparer = new NameComparator();
  
  public void sort(LinkedList<Student> data, int startingPoint, int endingPoint) {
    int midPoint;

    // Only run if pointers do not cross paths
    if(startingPoint < endingPoint) {
      midPoint = (startingPoint + endingPoint) / 2;

      // Split the left side
      sort(data, startingPoint, midPoint);
      // Split the right side
      sort(data, midPoint + 1, endingPoint);

      mergeData(data, startingPoint, midPoint, endingPoint);
    }
  }

  public void mergeData(LinkedList<Student> data, int startingPoint, int midPoint, int endingPoint) {
    int tempSize = endingPoint - startingPoint + 1; // 
    Student[] tempArray = new Student[tempSize];
    int mergePos, leftPointer, rightPointer;

    mergePos = 0;
    leftPointer = startingPoint;
    rightPointer = midPoint + 1;
    
    // get the smallest element from each list, compare and insert into temp array.
    while (leftPointer <= midPoint && rightPointer <= endingPoint) {
      if (this.comparer.compare(data.get(leftPointer), data.get(rightPointer)) <0 ) {
        tempArray[mergePos] = data.get(leftPointer);
        leftPointer++;
      } else {
        tempArray[mergePos] = data.get(rightPointer);
        rightPointer++;
      }
      mergePos++;
    }

    // Add remainder of first array to temp array
    while(leftPointer <= midPoint) {
      tempArray[mergePos] =  data.get(leftPointer);
      leftPointer++;
      mergePos++;
    }

    // Add remainder of second array to temp array
    while(rightPointer <= endingPoint) {
      tempArray[mergePos] = data.get(rightPointer);
      rightPointer++;
      mergePos++;
    }

    // Use temp array to copy back into original arrayList
    for(mergePos = 0; mergePos < tempSize; mergePos++) {
      data.set(startingPoint + mergePos, tempArray[mergePos]);
    }
  }
}
