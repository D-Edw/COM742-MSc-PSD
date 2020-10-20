package Lab7;

// Random number generator class

public class Q3 {

        public static void main(String[] args) {

            int [][] rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
            int [][] colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };
            int [] rowsum = allRowSums(rowmagic);
            int [] colsum = allColSums(rowmagic);

            for(int i = 0; i < rowsum.length; i++)
                System.out.println("All rows sums = " + rowsum[i]);

            for(int i = 0; i < colsum.length; i++)
                System.out.println("All cols sums = " + colsum[i]);

            System.out.println("Is row magic = " + isRowMagic(rowmagic));
            System.out.println("Is row magic = " + isRowMagic(colmagic));
            System.out.println("Is col magic = " + isColMagic(rowmagic));
            System.out.println("Is col magic = " + isColMagic(colmagic));
        }

        public static int [] allRowSums(int[][] a){
            int [] rowSum = new int [a.length];
            for( int r = 0; r < a.length; r++)
                for( int c = 0; c < a[0].length; c++)
                    rowSum[r] += a[r][c];

            return rowSum;
        }
        public static int[] allColSums(int[][] a){
            int [] colSum = new int [a[0].length];
            for( int r = 0; r < a.length; r++)
                for( int c = 0; c < a[0].length; c++)
                    colSum[c] += a[r][c];

            return colSum;
        }
        public static boolean isRowMagic(int[][] a){
            int [] rs = allRowSums(a);
            int val = rs[0];
            int i = 1;
            boolean isMagic = true;

            while(i < rs.length && isMagic == true)
            {
                if(rs[i] != val)
                    return(false);
                i++;
            }
            return isMagic;
        }
        public static boolean isColMagic(int[][] a){
            int [] cs = allColSums(a);
            int val = cs[0];
            int i = 1;
            boolean isMagic = true;
            while(i < cs.length && isMagic == true)
            {
                if(cs[i] != val)
                    return(false);
                i++;
            }
            return isMagic;
        }
    }
