# Simple singleton implementation in Python:
class SimpleSingleton:
    _instance = None
    def __new__(cls, *args, **kwargs):
        if not cls._instance:
            cls._instance = super().__new__(cls)
        return cls

# Example usage
if __name__ == "__main__":
    s1 = SimpleSingleton()
    s2 = SimpleSingleton()
    print(type(s1))

    if id(s1) == id(s2):
        print("Singleton works, both variables contain the same instance.")
    else:
        print("Singleton failed, variables contain different instances.")