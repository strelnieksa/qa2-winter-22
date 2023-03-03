Feature: Weather forecast

  Scenario: Weather forecast for specific city
    Given city ID is: 52347
    When we are requesting weather forecast

    Then coordinates are:
      | latitude   | 39.31 |
      | longtitude | -74.5 |

    And timezone information is:
      | timezone | America/New_York |
      | offset   | -18000           |

    And current weather data is:
      | time        | 1646318698 |
      | sunrise     | 1646306882 |
      | sunset      | 1646347929 |
      | temperature | 282.21     |
      | feels_like  | 278.41     |
      | pressure    | 1014       |
      | humidity    | 65         |
      | dew_point   | 275.99     |
      | uvi         | 2.55       |
      | clouds      | 40         |
      | visibility  | 10000      |

    And current wind data is:
      | wind_speed | 8.75  |
      | wind_deg   | 360   |
      | wind_gust  | 13.89 |

    And current weather is:
      | id          | 802              |
      | main        | Clouds           |
      | description | scattered clouds |
      | icon        | 03d              |

    And minutely weather data is:
      | time          | 1646318700 |
      | precipitation | 0          |

    And hourly weather data is:
      | time       | 1646316000 |
      | temp       | 281.94     |
      | feels_like | 278.49     |
      | pressure   | 1014       |
      | humidity   | 67         |
      | dew_point  | 276.16     |
      | uvi        | 1.49       |
      | clouds     | 52         |
      | visibility | 10000      |
      | pop        | 0.03       |

    And hourly wind data is:
      | wind_speed | 7.16  |
      | wind_deg   | 313   |
      | wind_gust  | 10.71 |

    And hourly weather is:
      | id          | 803           |
      | main        | Clouds        |
      | description | broken clouds |
      | icon        | 04d           |

    And daily weather data is:
      | dt         | 1646326800 |
      | sunrise    | 1646306882 |
      | sunset     | 1646347929 |
      | moonrise   | 1646309880 |
      | moonset    | 1646352120 |
      | moon_phase | 0.03       |
      | pressure   | 1016       |
      | humidity   | 55         |
      | dew_point  | 273.12     |
      | clouds     | 49         |
      | pop        | 0.25       |
      | rain       | 0.11       |
      | uvi        | 3.38       |

    And daily wind data is:
      | wind_speed | 9.29  |
      | wind_deg   | 3     |
      | wind_gust  | 16.48 |

    And daily weather temperature is:
      | day     | 281.63 |
      | min     | 271.72 |
      | max     | 282.21 |
      | night   | 271.72 |
      | evening | 277.99 |
      | morning | 280.92 |

    And daily feels like weather is:
      | day     | 277.83 |
      | night   | 264.72 |
      | evening | 273.35 |
      | morning | 277.66 |

    And daily weather is:
      | id          | 500        |
      | main        | Rain       |
      | description | light rain |
      | icon        | 10d        |

    And alert Nr. 1 received:
      | sender      | NWS Philadelphia - Mount Holly (New Jersey, Delaware, Southeastern Pennsylvania)                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | event       | Small Craft Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
      | start       | 1646344800                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | end         | 1646380800                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | description | ...SMALL CRAFT ADVISORY REMAINS IN EFFECT FROM 5 PM THIS AFTERNOON TO 3 AM EST FRIDAY... WHAT...North winds 15 to 20 kt with gusts up to 25 kt and seas 3 to 5 ft expected. WHERE...Coastal waters from Little Egg Inlet to Great Egg Inlet NJ out 20 nm, Coastal waters from Great Egg Inlet to Cape May NJ out 20 nm and Coastal waters from Manasquan Inlet to Little Egg Inlet NJ out 20 nm. * WHEN...From 5 PM this afternoon to 3 AM EST Friday. * IMPACTS...Conditions will be hazardous to small craft. |

    And tags for an alert Nr. 1 are:
      | Sunny  |
      | Clouds |

    And alert Nr. 2 received:
      | sender      | NWS Philadelphia - Mount Holly (New Jersey, Delaware, Southeastern Pennsylvania)                                                                                                                                                                                                                                                                                                                                                                                                                                |
      | event       | Small Craft Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
      | start       | 1646344800                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | end         | 1646380800                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | description | ...SMALL CRAFT ADVISORY REMAINS IN EFFECT FROM 5 PM THIS AFTERNOON TO 3 AM EST FRIDAY... WHAT...North winds 15 to 20 kt with gusts up to 25 kt and seas 3 to 5 ft expected. WHERE...Coastal waters from Little Egg Inlet to Great Egg Inlet NJ out 20 nm, Coastal waters from Great Egg Inlet to Cape May NJ out 20 nm and Coastal waters from Manasquan Inlet to Little Egg Inlet NJ out 20 nm. * WHEN...From 5 PM this afternoon to 3 AM EST Friday. * IMPACTS...Conditions will be hazardous to small craft. |

    And tags for an alert Nr. 2 are:
      | Sunny  |
      | Clouds |




#    Then  latitude is 39.31
#    And longitude -74.5
#    And timezone is "America/New_York"
#    And timezone offset is -18000
#    And current current time is 1646318698
#    And current sunrise is at 1646306882
#    And current sunset is at 1646347929
#    And current temperature is 282.21 K
