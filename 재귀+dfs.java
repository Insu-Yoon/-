    //dfs, 재귀를 사용한 코드조각 모음

    public int dfs(int[] cards, int sum, int prev, int count) {
        // 3-1. (기저조건) 조합에 사용한 카드개수가 3일 때, 카드의 합이 소수라면 1, 아니라면 0을 반환한다.
        if (count == 3&&isPrime[sum]) return 1;
        // 3-2. 카드를 prev + 1부터 crads.length까지 순회한다.
        for(int i=prev+1; i<cards.length; i++){
            // 3-3. 인자를 적절히 조정하여 재귀호출한다.
            // 3-4. 재귀호출한 결과를 더하여 반환한다.
            count += dfs(cards, sum+cards[i], prev+1, count+1 );
            return count;
        }
        return 0;
    }

    public void dfs(boolean[] visited, Integer[] choice, int depth){
        if(choicenum == depth) {
            result.add(Arrays.copyOf(choice,choice.length));
            return;
        }
        for(int i=0;i<freshStuffArr.length;i++){
            if(!visited[i]) {
                visited[i] = true;
                choice[depth] = freshStuffArr[i];
                dfs(visited, choice, depth+1);
                visited[i] = false;
            }
        }
    }
