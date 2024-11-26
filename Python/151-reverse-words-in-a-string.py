class Solution:

    @staticmethod
    def remove_spaces(input_string):
        return input_string.strip() 

    def reverse_words(self, s):
        s = self.remove_spaces(s)
        words = s.split() 
        reversed_words = " ".join(reversed(words))
        return reversed_words

solution = Solution()
result = solution.reverse_words("  the sky is blue  ")
print(f"Resultado: \"{result}\"") 
