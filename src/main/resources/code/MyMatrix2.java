import java.util.Arrays;
import java.util.Scanner;

/**
 * �����࣬ʵ�־���ļӷ�������˷�������Լ�ת�÷���
 * ���мӷ��͵�˷�����Ҫ������ʵ�ַ�ʽ
 * 1.����һ��MyMatrix�������2������Ĳ���
 * 2.�ӿ���̨��console������һ���������ݣ��ٽ��в���
 * ���е����ݾ�Ϊint��
 * �������ݾ�Ĭ��Ϊ��ȷ���ݣ�����Ҫ���������ݽ���У��
 *
 */
public class MyMatrix {

	private int[][] data;
	private int m; //����ĵ�һά����
	private int n; //����ĵڶ�ά����
	
	/**
	 * ���캯��������Ϊ2άint����
	 * a[i][j]�Ǿ����еĵ�i+1�У���j+1������
	 * @param a
	 */
	
	
	
	public MyMatrix(int[][] a){
		this.data = a;
		m=a.length;
		n=a[0].length;
	}

	/**
	 * ����2άint����
	 * @return int[][]
	 */
	public int[][] getArray(){
		return data;
	}

	/**
	 * ���ؾ���ĵ�һά����
	 * @return int
	 */
	public int getM(){
		return m;
	}

	/**
	 * ���ؾ���ĵڶ�ά����
	 * @return
	 */
	public int getN(){
		return n;
	}
	
	/**
	 * ʵ�־���ӷ�������һ���µľ���
	 * @param B
	 * @return
	 */
	public MyMatrix plus(MyMatrix B){
		
		int[][] a = null;
		int[][] b = null;
		
		MyMatrix mm1 = new MyMatrix(a) ;
		MyMatrix mm2 = new MyMatrix(b) ;
		
		int[][] sum = new int [a.length][a[0].length];
		if(a.length == b.length && a[0].length == b[0].length){
			for(int i = 0 ; i < sum.length ; i++){
				for(int j = 0 ; j < sum[i].length ; j++){
					sum[i][j] = a[i][j] + b[i][j];
				
				}
			}
		}
		
		return new MyMatrix(sum);
			
		
	}
	
	/**
	 * ʵ�־���˷�������һ���µľ���
	 * @param B
	 * @return
	 */
	public MyMatrix times(MyMatrix B){
		
		int[][] a = null;
		int[][] b = null;
		
		MyMatrix mm1 = new MyMatrix(a) ;
		MyMatrix mm2 = new MyMatrix(b) ;
		
		
		int[][] d = new int[a.length][b[0].length];
		
		if(a.length == b[0].length){
			for(int i = 0 ; i < a.length ; i++){
				for(int j = 0 ; j < b[i].length ; j++){
				int num = 0;
				for(int k = 0 ; k <a[i].length ; k++){
					num += a[i][k]*b[k][j];
				}
				d[i][i] = num;
				}
			}
		}
		
		return new MyMatrix(d);
	}
	
	/**
	 * ʵ�־���ĵ�ˣ�����һ���µľ���
	 * @param b
	 * @return
	 */
	public MyMatrix times(int b){
		int[][]a = null;
		int[][]c = null;
		
		MyMatrix mm1 = new MyMatrix(a) ;
		MyMatrix mm2 = new MyMatrix(c) ;
		
		int[][]dc = new int [a.length][a[0].length];
		
		if(a.length == c.length && a[0].length == c[0].length){
			for(int i = 0 ; i < a.length ; i++){
				for(int j=0 ; j < a[0].length ; j++){
					dc[i][j] = a[i][j] + c[i][j];
				}
			}
		}
		
		return new MyMatrix(dc);
	}
	
	/**
	 * ʵ�־����ת�ã�����һ���µľ���
	 * @return
	 */
	public MyMatrix transpose(){
		int[][] a = null;
		
		MyMatrix mm1 = new MyMatrix(a) ;
		
		
		int[][] result = new int[a.length][];
		for(int i = 0 ; i < a.length ; i++){
			result[i] = new int[a[i].length];
		}
		for(int x[]:a){
			for(int e:x){
				System.out.print(e+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < a[i].length ; j++){
				result[j][i] = a[i][j];
			}
		}
		for(int x[]:result){
			for(int e:x){
				System.out.print(e+" ");
			}
			System.out.println();
		}
		return new MyMatrix(result);
	}
	
	/**
	 * �ӿ���̨����������ݣ����о���ӷ����������ݸ�ʽ���£�
	 * m n
	 * m * n �����ݷ����Կո����
	 * example:
	 * 4 3
	 * 1 2 3 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * ����һ���µľ���
	 * @return
	 */
	public MyMatrix plusFromConsole(){
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = null;
		int[][] b = null;
		int[][] sums = new int [m][n];
		
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ; j++){
				sums[i][j] = a[i][j] + b[i][j];
				}
			
		}
		
		
		return new MyMatrix(sums);
	}
	
	/**
	 * �����ʽͬ�Ϸ�����ͬ
	 * ʵ�־���ĳ˷�
	 * ����һ���µľ���
	 * @return
	 */
	public MyMatrix timesFromConsole(){
        Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = null;
		int[][] b = null;
		int[][] sumss = new int [m][n];
		
		if(m == n){
			
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < n ; j++){
			    int num = 0;
				for(int k = 0 ; k <n ; k++){
					num += a[i][k]*b[k][j];
				}
				sumss[i][i] = num;
				}
			}
		}
		return new MyMatrix(sumss);
		

	}
	
	/**
	 * ��ӡ���þ��������
	 * ��ʼһ�����У�����һ������
	 * ������ÿһ�����ݳ�һ�У����ݼ��Կո����
	 * example��
	 * 
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 1 2 3
	 * 
	 */
	public void print(){
		int[][] a = null;
		for(int i = 0 ; i< a.length ; i++){
			if(i== 0){
				System.out.print("\n");
			}
			for(int j = 0 ; j < a[0].length ; j++){
				if( j == a[0].length){
					System.out.print(a[i][j]+"\n");
				}else{
					System.out.print(a[i][j]+" ");
				}
				
			}
		}
	}
	
	/**
	 * �ж��Ƿ���ȵķ�����������Ҫ�޸ģ���
	 */
	public boolean equals(Object obj){
		
		if(obj instanceof MyMatrix){
			MyMatrix matrix = (MyMatrix) obj;
			
			if(this.data.length != matrix.data.length){
				return false;
			}
			
			for(int i=0 ; i<this.data.length ; ++i){
				if(!Arrays.equals(this.data[i], matrix.data[i])){
					return false;
				}
			}
			
			return true;
			
		}else{
			return false;
		}
	}
	
}
