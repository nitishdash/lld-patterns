# Meta class implementation of Singleton pattern:
def singleton(cls):
    __instances = {}

    def get_instance(*args, **kwargs):
        if cls not in __instances:
            instance = cls(*args, **kwargs)
            __instances[cls] = instance
        return __instances[cls]
    
    return get_instance

@singleton
class Singleton(): pass

# Example usage
if __name__ == "__main__":
    s1 = Singleton()
    s2 = Singleton()
    print(type(s1))

    if id(s1) == id(s2):
        print("Singleton works, both variables contain the same instance.")
    else:
        print("Singleton failed, variables contain different instances.")