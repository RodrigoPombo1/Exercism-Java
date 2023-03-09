
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int n_birds:this.birdsPerDay) {
            if (n_birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res = 0;
        for (int i = 0; i < numberOfDays && i < this.birdsPerDay.length; i++) {
            res += this.birdsPerDay[i];
        }
        return res;
    }

    public int getBusyDays() {
        int res = 0;
        for (int n_birds:this.birdsPerDay) {
            if (n_birds > 4) {
                res++;
            }
        }
        return res;
    }
}
