public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double dCountOfBuckets = area / areaPerBucket;
        int countOfBuckets = 0;

        if (dCountOfBuckets % 1 != 0) {
            dCountOfBuckets += 1;
            countOfBuckets = (int) dCountOfBuckets;
        }

        return countOfBuckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double dCountOfBuckets = area / areaPerBucket;
        int countOfBuckets = 0;

        if (dCountOfBuckets % 1 != 0) {
            dCountOfBuckets += 1;
            countOfBuckets = (int) dCountOfBuckets;
        }

        return countOfBuckets;
    }
}
