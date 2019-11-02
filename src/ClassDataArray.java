//Dan Chovanes
//Code provided by Robert Lafore

import java.util.*;

class ClassDataArray {
    private Player[] arr;
    private int nElems;

    public ClassDataArray(int max) {
        arr = new Player[max];
        nElems = 0;
    }

    public void insert(String first, String last, int num, String pos, String h, int lbs, int a, String yrs, String school) {
        arr[nElems] = new Player(first,last,num,pos,h,lbs,a,yrs,school);
        nElems++;
    }

    public void displayArr() {
        for (int j=0; j<nElems; j++) {
            arr[j].displayPlayer();
            System.out.println();
        }
    }

    public void BubbleSort(int x) {
        int out,in;

        if (x == 3)
            for (out=nElems-1; out>1; out--)
                for (in=0; in<out; in++)
                    if ( arr[in].getNumber() > arr[in+1].getNumber() )
                        swap(in,in+1);

        if (x==4)
            for (out=nElems-1; out>1; out--)
                for (in=0; in<out; in++)
                    if ( arr[in].getAge() > arr[in+1].getAge() )
                        swap(in,in+1);

        if (x==5)
            for (out=nElems-1; out>1; out--)
                for (in=0; in<out; in++)
                    if ( arr[in].getWeight() > arr[in+1].getWeight() )
                        swap(in,in+1);
    }

    public void SelectionSort(int x) {
        int out, in, min;

        if (x == 1) {
            for (out = 0; out < nElems - 1; out++) {
                min = out;
                for (in = out + 1; in < nElems; in++) {
                    if (arr[in].getfName().compareTo(arr[min].getfName()) < 0)
                        min = in;
                    swap(out, min);
                }
            }
        }
        if (x == 2) {
            for (out = 0; out < nElems - 1; out++) {
                min = out;
                for (in = out + 1; in < nElems; in++) {
                    if (arr[in].getlName().compareTo(arr[min].getlName()) < 0)
                        min = in;
                    swap(out, min);
                }
            }
        }
        if (x == 6) {
            for (out = 0; out < nElems - 1; out++) {
                min = out;
                for (in = out + 1; in < nElems; in++) {
                    if (arr[in].getCollege().compareTo(arr[min].getCollege()) < 0)
                        min = in;
                    swap(out, min);
                }
            }
        }
    }

    private void swap(int one, int two) {
        Player temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}