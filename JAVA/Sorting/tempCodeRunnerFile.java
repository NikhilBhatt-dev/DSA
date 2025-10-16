 static void Selection(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last); 
            swap(arr, maxIndex, last);
        }
    }
