# 🌀 Pawala Sort

**Pawala Sort** is a custom sorting algorithm created by [Your Name] that sorts an array using a strategy similar to selection sort, but with *immediate swaps* upon finding a smaller element.

---

## 📌 What Makes Pawala Sort Unique?

- 🛠️ **Immediate Swapping** – Instead of waiting to find the smallest element, it swaps on-the-go.
- 📚 **Easy to Understand** – Great for learning sorting logic and algorithm design.
- ⚙️ **In-place Sorting** – No extra space used.
- 📈 **Best for Small Arrays** – Like other O(n²) sorts, it's efficient for small datasets.

---

## 🚀 How It Works

For each index `i`, iterate through the rest of the array (from `i+1` to `n-1`), and if any element `j` is smaller than `i`, swap them immediately.

### 🔁 Java Code Example

```java
public class PawalaSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 9, 2, 4, 5};
        pawalaSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void pawalaSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
