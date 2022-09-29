//boolean[] isPrime만들고 true로 초기화
isPrime = new boolean[Length + 1];
Arrays.fill(isPrime, true);
//소수 판별할 범위
int area;
//제곱근까지만 수행해도 판별가능
int new_area = Math.sqrt(area);

for (int i = 2; i <= new_area; i++) {
  for (int j = 2; i * j <= area; j++) {
    isPrime[i * j] = false;
  }
}
