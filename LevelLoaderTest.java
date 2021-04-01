
class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
 class LevelTooBigException extends Exception {
}

class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        int result = level.getWidth() * level.getHeight();
         if (result < 100000) {
             System.out.println("Level loaded");

         } else throw new LevelTooBigException();

    }
}



class LevelLoaderTest {
    public static void main(String[] args) throws LevelTooBigException {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}
