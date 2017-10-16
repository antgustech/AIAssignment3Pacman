package pacman.controllers.Assignment3.Tree.Attribute;

import dataRecording.DataTuple;

public class Utility {

    public static int getAttributeValue(DataTuple tuple, Attribute attribute) {
        switch (attribute) {
            case isBlinkyEdible:
                return tuple.normalizeBoolean(tuple.isBlinkyEdible);
            case isInkyEdible:
                return tuple.normalizeBoolean(tuple.isInkyEdible);
            case isPinkyEdible:
                return tuple.normalizeBoolean(tuple.isPinkyEdible);
            case isSueEdible:
                return tuple.normalizeBoolean(tuple.isSueEdible);
            case blinkyDir:
                return tuple.blinkyDir.ordinal();
            case inkyDir:
                return tuple.inkyDir.ordinal();
            case pinkyDir:
                return tuple.pinkyDir.ordinal();
            case sueDir:
                return tuple.sueDir.ordinal();
            case numberOfTotalPillsInLevel:
                return tuple.discretizeNumberOfPowerPills(tuple.numberOfTotalPillsInLevel).ordinal();
            case numOfPillsLeft:
                return tuple.discretizeNumberOfPowerPills(tuple.numOfPillsLeft).ordinal();
            case numberOfTotalPowerPillsInLevel:
                return tuple.discretizeNumberOfPowerPills(tuple.numberOfTotalPowerPillsInLevel).ordinal();
            case numPowerPillsLeft:
                return tuple.discretizeNumberOfPowerPills(tuple.numOfPowerPillsLeft).ordinal();
            case pacmanPosition:
                return tuple.discretizePosition(tuple.pacmanPosition).ordinal();
            case currentScore:
                return tuple.discretizeCurrentScore(tuple.currentScore).ordinal();
            case currentLevelTime:
                return tuple.discretizeCurrentLevelTime(tuple.currentLevelTime).ordinal();
            case pacmanLivesLeft:
                return tuple.pacmanLivesLeft;
        }

        return -100000; //Attribute not found
    }

    //TODO All all relevant attributes and a switch statement.
    public static int getNumberOfSubsets(Attribute attribute) {
        switch (attribute) {
            case isBlinkyEdible:
                return 2;
            case isInkyEdible:
                return 2;
            case isPinkyEdible:
                return 2;
            case isSueEdible:
                return 2;
            case blinkyDir:
                return 4;
            case inkyDir:
                return 4;
            case pinkyDir:
                return 4;
            case sueDir:
                return 4;
            case numberOfTotalPillsInLevel:
                return 5;
            case numOfPillsLeft:
                return 5;
            case numberOfTotalPowerPillsInLevel:
                return 5;
            case numPowerPillsLeft:
                return 5;
            case pacmanPosition:
                return 5;
            case currentScore:
                return 5;
            case currentLevelTime:
                return 5;
            case pacmanLivesLeft:
                return 4;

        }
        return -100000; //Attribute not found
    }
}