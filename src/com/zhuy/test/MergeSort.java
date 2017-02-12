package com.zhuy.test;

public class MergeSort {
    public void Merge(int[] array, int low, int mid, int high) {
        int i = low; // i�ǵ�һ�����е��±�
        int j = mid + 1; // j�ǵڶ������е��±�
        int k = 0; // k����ʱ��źϲ����е��±�
        int[] array2 = new int[high - low + 1]; // array2����ʱ�ϲ�����

        // ɨ���һ�κ͵ڶ������У�ֱ����һ��ɨ�����
        while (i <= mid && j <= high) {
            // �жϵ�һ�κ͵ڶ���ȡ�������ĸ���С���������ϲ����У�����������ɨ��
            if (array[i] <= array[j]) {
                array2[k] = array[i];
                i++;
                k++;
            } else {
                array2[k] = array[j];
                j++;
                k++;
            }
        }

        // ����һ�����л�ûɨ���꣬����ȫ�����Ƶ��ϲ�����
        while (i <= mid) {
            array2[k] = array[i];
            i++;
            k++;
        }

        // ���ڶ������л�ûɨ���꣬����ȫ�����Ƶ��ϲ�����
        while (j <= high) {
            array2[k] = array[j];
            j++;
            k++;
        }

        // ���ϲ����и��Ƶ�ԭʼ������
        for (k = 0, i = low; i <= high; i++, k++) {
            array[i] = array2[k];
        }
    }

    public void MergePass(int[] array, int gap, int length) {
        int i = 0;

        // �鲢gap���ȵ����������ӱ�
        for (i = 0; i + 2 * gap - 1 < length; i = i + 2 * gap) {
            Merge(array, i, i + gap - 1, i + 2 * gap - 1);
        }

        // ���������ӱ����߳���С��gap
        if (i + gap - 1 < length) {
            Merge(array, i, i + gap - 1, length - 1);
        }
    }

    public int[] sort(int[] list) {
        for (int gap = 1; gap < list.length; gap = 2 * gap) {
            MergePass(list, gap, list.length);
            System.out.print("gap = " + gap + ":\t");
            this.printAll(list);
        }
        return list;
    }

    // ��ӡ��������
    public void printAll(int[] list) {
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {
                9, 1, 5, 3, 4, 2, 6, 8, 7
        };

        MergeSort merge = new MergeSort();
        System.out.print("����ǰ:\t\t");
        merge.printAll(array);
        merge.sort(array);
        System.out.print("�����:\t\t");
        merge.printAll(array);
    }
}
