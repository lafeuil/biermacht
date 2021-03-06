package com.biermacht.brews.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class Units {

  // Unit systems
  public static final String IMPERIAL = "Imperial";
  public static final String METRIC = "Metric";

  // Imperial Units
  public static final String OUNCES = "oz";
  public static final String GALLONS = "gal";
  public static final String POUNDS = "lbs";
  public static final String TEASPOONS = "tsp";
  public static final String FAHRENHEIT = "\u2109";
  public static final String CUP = "Cup";
  public static final String CUPS = "Cups";
  public static final String QUARTS_PER_POUND = "qt/lb";
  public static final String QUARTS = "qt";
  public static final String PINTS = "pt";
  public static final String TABLESPOONS = "tbps";

  // Metric Units
  public static final String KILOGRAMS = "kg";
  public static final String GRAMS = "grams";
  public static final String MILLIGRAMS = "mg";
  public static final String LITERS = "liters";
  public static final String MILLILITERS = "ml";
  public static final String CELSIUS = "\u2103";
  public static final String LITERS_PER_KG = "L/kg";

  // Agnostic Units
  public static final String PACKAGES = "pkg";
  public static final String ITEMS = "items";
  public static final String DAYS = "days";
  public static final String MINUTES = "mins";
  public static final String HOURS = "hours";
  public static final String PLATO = "plato";
  public static final String GRAVITY = "sg";
  public static final String UNITS = "units";

  // Formal units - Full spellings for displaying in lists, etc.
  // Make sure to add these to the converter below!
  public static final String TEASPOONS_FORMAL = "Teaspoons";
  public static final String CUPS_FORMAL = "Cups";
  public static final String GRAMS_FORMAL = "Grams";
  public static final String GALLONS_FORMAL = "Gallons";
  public static final String LITERS_FORMAL = "Liters";
  public static final String OUNCES_FORMAL = "Ounces";
  public static final String ITEMS_FORMAL = "Items";
  public static final String KILOGRAMS_FORMAL = "Kilograms";
  public static final String MILLILITERS_FORMAL = "Milliliters";
  public static final String PACKAGES_FORMAL = "Packages";
  public static final String POUNDS_FORMAL = "Pounds";
  public static final String UNITS_FORMAL = "Units";

  // SharedPreferences to use.
  private static SharedPreferences preferences = BiermachtApplication.getContext().getSharedPreferences(Constants.PREFERENCES, Context.MODE_PRIVATE);

  public static String toAbbreviation(String s) {
    if (s.toLowerCase().equals(TEASPOONS_FORMAL.toLowerCase())) {
      return TEASPOONS;
    }
    if (s.toLowerCase().equals(CUPS_FORMAL.toLowerCase())) {
      return CUPS;
    }
    if (s.toLowerCase().equals(GRAMS_FORMAL.toLowerCase())) {
      return GRAMS;
    }
    if (s.toLowerCase().equals(GALLONS_FORMAL.toLowerCase())) {
      return GALLONS;
    }
    if (s.toLowerCase().equals(LITERS_FORMAL.toLowerCase())) {
      return LITERS;
    }
    if (s.toLowerCase().equals(OUNCES_FORMAL.toLowerCase())) {
      return OUNCES;
    }
    if (s.toLowerCase().equals(ITEMS_FORMAL.toLowerCase())) {
      return ITEMS;
    }
    if (s.toLowerCase().equals(KILOGRAMS_FORMAL.toLowerCase())) {
      return KILOGRAMS;
    }
    if (s.toLowerCase().equals(MILLILITERS_FORMAL.toLowerCase())) {
      return MILLILITERS;
    }
    if (s.toLowerCase().equals(PACKAGES_FORMAL.toLowerCase())) {
      return PACKAGES;
    }
    if (s.toLowerCase().equals(POUNDS_FORMAL.toLowerCase())) {
      return POUNDS;
    }
    else {
      return UNITS;
    }
  }

  public static String toFormal(String s) {
    if (s.toLowerCase().equals(TEASPOONS.toLowerCase())) {
      return TEASPOONS_FORMAL;
    }
    if (s.toLowerCase().equals(CUPS.toLowerCase())) {
      return CUPS_FORMAL;
    }
    if (s.toLowerCase().equals(GRAMS.toLowerCase())) {
      return GRAMS_FORMAL;
    }
    if (s.toLowerCase().equals(GALLONS.toLowerCase())) {
      return GALLONS_FORMAL;
    }
    if (s.toLowerCase().equals(LITERS.toLowerCase())) {
      return LITERS_FORMAL;
    }
    if (s.toLowerCase().equals(OUNCES.toLowerCase())) {
      return OUNCES_FORMAL;
    }
    if (s.toLowerCase().equals(ITEMS.toLowerCase())) {
      return ITEMS_FORMAL;
    }
    if (s.toLowerCase().equals(KILOGRAMS.toLowerCase())) {
      return KILOGRAMS_FORMAL;
    }
    if (s.toLowerCase().equals(MILLILITERS.toLowerCase())) {
      return MILLILITERS_FORMAL;
    }
    if (s.toLowerCase().equals(PACKAGES.toLowerCase())) {
      return PACKAGES_FORMAL;
    }
    if (s.toLowerCase().equals(POUNDS.toLowerCase())) {
      return POUNDS_FORMAL;
    }
    else {
      return UNITS_FORMAL;
    }
  }

  public static String getUnitsFromDisplayAmount(String s) {
    Log.d("Units", "Getting units from display amount: " + s);
    String unit = "";
    ArrayList<String> temp = new ArrayList<String>(Arrays.asList(s.split(" ")));
    if (temp.size() == 2) {
      unit = temp.get(temp.size() - 1);
    }

    // Assign a Units class standard unit here
    if (unit.equals("tsp") || unit.equals("teaspoons")) {
      unit = Units.TEASPOONS;
    }
    if (unit.equalsIgnoreCase("qt") || unit.equalsIgnoreCase("quarts") || unit.equalsIgnoreCase
            ("quart") || unit.equalsIgnoreCase("qts")) {
      unit = Units.QUARTS;
    }
    if (unit.equals("g") || unit.equals("grams")) {
      unit = Units.GRAMS;
    }
    if (unit.equals("oz") || unit.equals("ounces")) {
      unit = Units.OUNCES;
    }
    if (unit.contains("gal")) {
      unit = Units.GALLONS;
    }
    if (unit.equals("item") || unit.equals("items")) {
      unit = Units.ITEMS;
    }
    if (unit.contains("package") || unit.equals("pkg")) {
      unit = Units.PACKAGES;
    }
    if (unit.equalsIgnoreCase(PLATO)) {
      unit = Units.PLATO;
    }
    if (unit.equalsIgnoreCase(GRAVITY)) {
      unit = Units.GRAVITY;
    }
    if (unit.equalsIgnoreCase("F")) {
      unit = Units.FAHRENHEIT;
    }
    if (unit.equalsIgnoreCase("C")) {
      unit = Units.CELSIUS;
    }
    if (unit.equalsIgnoreCase("qt/lb")) {
      unit = Units.QUARTS_PER_POUND;
    }
    if (unit.equalsIgnoreCase(LITERS_PER_KG)) {
      unit = Units.LITERS_PER_KG;
    }

    Log.d("Units", "Got units: " + unit);
    return unit;
  }

  public static double getAmountFromDisplayAmount(String s) {
    Log.d("Units", "Getting amount from display amount: " + s);
    ArrayList<String> temp = new ArrayList<String>(Arrays.asList(s.split(" ")));
    if (getUnitsFromDisplayAmount(s).equals("")) {
      Log.d("Units", "Unable to determine units from: " + s);
      return 0;
    }
    else if (temp.size() <= 2 && temp.size() > 0) {
      try {
        Log.d("Units", "Returning amount: " + Double.parseDouble(temp.get(0).replace(",", ".")));
        return Double.parseDouble(temp.get(0).replace(",", "."));
      } catch (Exception e) {
        e.printStackTrace();
        Log.d("Units", "Error parsing display amount: " + s);
      }
    }
    else {
      Log.d("Units", "Received bad display amount: " + s);
    }
    Log.d("Units", "Failed to get amount. Returning 0");
    return 0;
  }

  public static int toSeconds(double time, String units) {
    if (units.equals(MINUTES)) {
      return (int) (time * 60);
    }
    if (units.equals(HOURS)) {
      return (int) (time * 3600);
    }

    return 0;
  }

  // Functions for converting units below
  public static double platoToGravity(double p) {
    return p / (258.6 - ((p / 258.2) * 227.1)) + 1;
  }

  public static double fahrenheitToCelsius(double f) {
    return (f - 32) / 1.8;
  }

  public static double celsiusToFahrenheit(double c) {
    return c * 1.8 + 32;
  }

  public static double LPKGtoQPLB(double d) {
    return d * .479305709;
  }

  public static double QPLBtoLPKG(double d) {
    return d / .479305709;
  }

  public static double litersToGallons(double l) {
    return l * .264172052;
  }

  public static double cupsToLiters(double c) {
    return c * .236;
  }

  public static double litersToCups(double l) {
    return l / .236;
  }

  public static double litersToMillis(double l) {
    return l * 1000;
  }

  public static double millisToLiters(double m) {
    return m / 1000;
  }

  public static double minutesToDays(double m) {
    return m / 1440;
  }

  public static double minutesToHours(double m) {
    return m / 60;
  }

  public static double daysToMinutes(double d) {
    return d * 1440;
  }

  public static double gallonsToLiters(double g) {
    return g / .264172052;
  }

  public static double litersToOunces(double l) {
    return l / .0295735;
  }

  public static double ouncesToLiters(double o) {
    return o * .0295735;
  }

  public static double litersToTeaspoons(double l) {
    return l * 202.884;
  }

  public static double litersToTablespoons(double l) {
    return l * 67.628;
  }

  public static double teaspoonsToLiters(double t) {
    return t / 202.884;
  }

  public static double tablespoonsToLiters(double t) {
    return t / 67.628;
  }

  public static double quartsToLiters(double q) {
    return q * .946353;
  }

  public static double pintsToLiters(double p) {
    return p / 2.11338;
  }

  public static double litersToQuarts(double l) {
    return l / .946353;
  }

  public static double litersToPints(double l) {
    return 1 / 2.11338;
  }

  public static double kilosToPounds(double k) {
    return k * 2.204;
  }

  public static double kilosToOunces(double k) {
    return k * 35.2739619;
  }

  public static double ouncesToKilos(double o) {
    return o / 35.2739619;
  }

  public static double poundsToKilos(double p) {
    return p / 2.204;
  }

  public static double kilosToGrams(double k) {
    return k * 1000;
  }

  public static double gramsToKilos(double g) {
    return g / 1000;
  }

  public static double milligramsToKilos(double mg) {
    return mg / 1000 / 1000;
  }

  public static double kilosToMilligrams(double kg) {
    return kg * 1000 * 1000;
  }

  public static double ouncesToGrams(double o) {
    return o * 28.3495231;
  }

  public static double gramsToOunces(double g) {
    return g / 28.3495231;
  }

  // Methods to return the units for each measurement system
  public static String getUnitSystem() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals
            (IMPERIAL)) {
      return IMPERIAL;
    }
    else {
      return METRIC;
    }
  }

  public static String getHopUnits() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals
            (IMPERIAL)) {
      return OUNCES;
    }
    else {
      return GRAMS;
    }
  }

  public static String getFermentableUnits() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals
            (IMPERIAL)) {
      return POUNDS;
    }
    else {
      return KILOGRAMS;
    }
  }

  public static String getWaterToGrainUnits() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals
            (IMPERIAL)) {
      return QUARTS_PER_POUND;
    }
    else {
      return LITERS_PER_KG;
    }
  }

  public static String getStrikeVolumeUnits() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals
            (IMPERIAL)) {
      return QUARTS;
    }
    else {
      return LITERS;
    }
  }

  public static String getTemperatureUnits() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals
            (IMPERIAL)) {
      return FAHRENHEIT;
    }
    else {
      return CELSIUS;
    }
  }

  public static String getVolumeUnits() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals(IMPERIAL)) {
      return GALLONS;
    }
    else {
      return LITERS;
    }
  }

  public static String getWeightUnits() {
    if (preferences.getString(Constants.PREF_MEAS_SYSTEM, Units.IMPERIAL).equals
            (IMPERIAL)) {
      return POUNDS;
    }
    else {
      return KILOGRAMS;
    }
  }

  public static double toLiters(double amount, String unit) {
    if (unit.equals(GALLONS)) {
      return gallonsToLiters(amount);
    }
    if (unit.equals(QUARTS)) {
      return quartsToLiters(amount);
    }
    if (unit.equals(MILLILITERS)) {
      return millisToLiters(amount);
    }
    if (unit.equals(CUPS) || unit.equals(CUP)) {
      return cupsToLiters(amount);
    }
    if (unit.equals(TEASPOONS)) {
      return teaspoonsToLiters(amount);
    }
    if (unit.equals(OUNCES)) {
      return ouncesToLiters(amount);
    }
    if (unit.equals(LITERS)) {
      return amount;
    }
    return - 1;
  }

  public static String getMetricEquivalent(String imp, boolean isWeight) {
    if (imp.equals(Units.GALLONS)) {
      return LITERS;
    }
    else if (imp.equals(Units.TEASPOONS)) {
      return MILLILITERS;
    }
    else if (imp.equals(Units.OUNCES)) {
      if (isWeight) {
        return GRAMS;
      }
      else {
        return MILLILITERS;
      }
    }
    else if (imp.equals(Units.POUNDS)) {
      return KILOGRAMS;
    }
    else if (imp.equals(Units.CUP) || imp.equals(Units.CUPS)) {
      return LITERS;
    }
    else {
      return imp;
    }
  }
}
