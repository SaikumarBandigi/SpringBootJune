package com.sb.crud.service;

import org.springframework.stereotype.Service;

@Service
public class BinarySearchService {
    public static int binarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <end) {
            int mid = start + (end - start) / 2;
            if (target == a[mid]) {
                return mid;
            }
            if (target > a[mid]) {
                start = mid + 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
