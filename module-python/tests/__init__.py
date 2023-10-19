import unittest

from module_python import sum

class TestSum(unittest.TestCase):
    def test_one_plus_one(self):
        """
        Verifies 1 + 1 = 2
        """
        result = sum(1, 1)

        self.assertEqual(result, 2)

    def test_nine_plus_three(self):
        """
        Verifies 9 + 3 = 12
        """
        result = sum(9, 3)

        self.assertEqual(result, 12)

if __name__ == '__main__':
    unittest.main()