public enum TransportType {
    TOYOTA{
        @Override
        public double calculateTravelCost(double distance){
            return distance*0.5;
        }
    },
    BMW{
        @Override
        public double calculateTravelCost(double distance){
            return distance*0.6;
        }
    },
    HONDA{
        @Override
        public double calculateTravelCost(double distance){
            return distance*0.7;
        }
    },
    AUDI{
        @Override
        public double calculateTravelCost(double distance){
            return distance*0.6;
        }
    },
    MERCEDES_BENZ{
        @Override
        public double calculateTravelCost(double distance){
            return distance*0.5;
        }
    };
    public abstract double calculateTravelCost(double distance);


}
