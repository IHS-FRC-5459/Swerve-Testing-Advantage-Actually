// Copyright 2021-2024 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot;

import edu.wpi.first.math.geometry.Rotation2d;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final Mode currentMode = Mode.REAL;

  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }

  public static final class Drive {
    public static int pigeonId = 1;

    public static class Mod0 {
      public static final int driveMotorID = 1;
      public static final int angleMotorID = 2;
      public static final int canCoderID = 9;
      public static final Rotation2d encoderOffset = new Rotation2d(0); // 12.119531250000003
      // or: public static final Rotation2d angleOffset = Rotation2d.fromDegrees(150.29);
    }

    public static class Mod1 {
      public static final int driveMotorID = 3;
      public static final int angleMotorID = 4;
      public static final int canCoderID = 10;
      public static final Rotation2d encoderOffset = new Rotation2d(0);
      // or: public static final Rotation2d angleOffset = Rotation2d.fromDegrees(150.29);
    }

    public static class Mod2 {
      public static final int driveMotorID = 5;
      public static final int angleMotorID = 6;
      public static final int canCoderID = 11;
      public static final Rotation2d encoderOffset = new Rotation2d(0);
      // or: public static final Rotation2d angleOffset = Rotation2d.fromDegrees(150.29);
    }

    public static class Mod3 {
      public static final int driveMotorID = 7;
      public static final int angleMotorID = 8;
      public static final int canCoderID = 12;
      public static final Rotation2d encoderOffset = new Rotation2d(0);
      // or: public static final Rotation2d angleOffset = Rotation2d.fromDegrees(150.29);
    }
  }
}
