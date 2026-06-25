class maxnumbalon(object):

    def maxNumberOfBalloons(self, text):
        b = text.count('b')
        a = text.count('a')
        l = text.count('l')
        o = text.count('o')
        n = text.count('n')

        return min(b, a, l // 2, o // 2, n)
    
object = maxnumbalon()
text = "loonbalxballpoon"
result = object.maxNumberOfBalloons(text)
print(result)  
    