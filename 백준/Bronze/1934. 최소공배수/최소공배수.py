def getGCD(A,B):
    if B == 0:
        return A
    else:
        return getGCD(B, A%B)

def getLCM(A,B):
    answer = (A * B) // getGCD(A,B)
    return answer

T = int(input())

for i in range(T):
    A, B = map(int, input().split())
    print(getLCM(A,B))