Run the price engine application by below commands.

1. mvn clean install
2. mvn clean package
3. Two ways to execute the jar file 
    1. java -jar target/CycleEnginePrice-1.0-SNAPSHOT.jar 
        - Enter the selection through command line.
    
    2. java -jar target/CycleEnginePrice-1.0-SNAPSHOT.jar start
        - It will automatically configure 1000 cycles and tell the price to manufacture it.
        
#####Below is the configurable components available for testing.
    1. Available Frames

|    Type       |     Date            |      Price      |
| :---          |    :----:           |     :---:       |
| Aluminium     | Before Nov,30,2016  |       1000      |
| Aluminium     | After Dec,1,2016    |       1200      |
| Carbon Fiber  | Before Nov,30,2016  |       1200      |
| Carbon Fiber  | After Dec,1,2016    |       1500      |
| Titanium      | Before Nov,30,2016  |       1500      |
| Titanium      | After Dec,1,2016    |       1800      |
| Steel         | Before Nov,30,2016  |       800       |
| Steel         | After Dec,1,2016    |       1000      |

    2. Available Brakes

|    Type       |     Date            |      Price      |
| :---          |    :----:           |     :---:       |
| Rim Brakes    | Before Nov,30,2016  |       500       |
| Rim Brakes    | After Dec,1,2016    |       700       |
| V Brakes      | Before Nov,30,2016  |       300       |
| V Brakes      | After Dec,1,2016    |       500       |
| Disc Brakes   | Before Nov,30,2016  |       1000      |
| Disc Brakes   | After Dec,1,2016    |       1200      |
| Drum Brakes   | Before Nov,30,2016  |       700       |
| Drum Brakes   | After Dec,1,2016    |       900       |
| Coaster Brakes| Before Nov,30,2016  |       400       |
| Coaster Brakes| After Dec,1,2016    |       600       |

    3. Available Chain Assemblies

|    Type                   |     Date            |      Price      |
| :---                      |    :----:           |     :---:       |
| MTB/Road Chains           | Before Nov,30,2016  |       500       |
| MTB/Road Chains           | After Dec,1,2016    |       700       |
| BMX Chains                | Before Nov,30,2016  |       300       |
| BMX Chains                | After Dec,1,2016    |       500       |

    4. Available Gears

|    No. of Gears           |     Date            |      Price       |
| :---                      |    :----:           |     :---:        |
| 4                         | Before Nov,30,2016  |       1500       |
| 4                         | After Dec,1,2016    |       1700       |
| 6                         | Before Nov,30,2016  |       1800       |
| 6                         | After Dec,1,2016    |       2000       |
| 8                         | Before Nov,30,2016  |       2200       |
| 8                         | After Dec,1,2016    |       2400       |
| 12                        | Before Nov,30,2016  |       2800       |
| 12                        | After Dec,1,2016    |       3000       |
| 16                        | Before Nov,30,2016  |       3000       |
| 16                        | After Dec,1,2016    |       4000       |


    5. Available Handle Bars

|    Type                   |     Date            |      Price       |
| :---                      |    :----:           |     :---:        |
| Flat Bar                  | Before Nov,30,2016  |       1000       |
| Flat Bar                  | After Dec,1,2016    |       1200       |
| Riser Bar                 | Before Nov,30,2016  |       1200       |
| Riser Bar                 | After Dec,1,2016    |       1400       |
| Bull Horn                 | Before Nov,30,2016  |       1400       |
| Bull Horn                 | After Dec,1,2016    |       1600       |
| Drop Bar                  | Before Nov,30,2016  |       1600       |
| Drop Bar                  | After Dec,1,2016    |       1800       |
| Aero Bar                  | Before Nov,30,2016  |       1800       |
| Aero Bar                  | After Dec,1,2016    |       2000       |
| Cruiser Bar               | Before Nov,30,2016  |       2000       |
| Cruiser Bar               | After Dec,1,2016    |       2200       |
| Butterfly Bar             | Before Nov,30,2016  |       2200       |
| Butterfly Bar             | After Dec,1,2016    |       2400       |


    6. Available Seats

|    Type                   |     Date            |      Price       |
| :---                      |    :----:           |     :---:        |
| Racing Saddle             | Before Nov,30,2016  |       500        |
| Racing Saddle             | After Dec,1,2016    |       700        |
| Comfort Saddle            | Before Nov,30,2016  |       800        |
| Comfort Saddle            | After Dec,1,2016    |       1000       |
| Cruiser Saddle            | Before Nov,30,2016  |       1000       |
| Cruiser Saddle            | After Dec,1,2016    |       1200       |

    6. Available Tyres

|    Type                   |     Date            |      Price       |
| :---                      |    :----:           |     :---:        |
| Standard Street           | Before Nov,30,2016  |       2000       |
| Standard Street           | After Dec,1,2016    |       2200       |
| Street Sport              | Before Nov,30,2016  |       2200       |
| Street Sport              | After Dec,1,2016    |       2400       |
| Super Sport               | Before Nov,30,2016  |       2400       |
| Super Sport               | After Dec,1,2016    |       2600       |
| All Terrain               | Before Nov,30,2016  |       2600       |
| All Terrain               | After Dec,1,2016    |       2800       |
| Off Road                  | Before Nov,30,2016  |       2800       |
| Off Road                  | After Dec,1,2016    |       3000       |
| Racing Slick              | Before Nov,30,2016  |       3000       |
| Racing Slick              | After Dec,1,2016    |       3200       |

    6. Available Wheels

|    Rims Type              |     Date            |      Price       |
| :---                      |    :----:           |     :---:        |
| Shallow Section Tubular   | Before Nov,30,2016  |       2000       |
| Shallow Section Tubular   | After Dec,1,2016    |       2200       |
| Shallow Section Tubeless  | Before Nov,30,2016  |       2000       |
| Shallow Section Tubeless  | After Dec,1,2016    |       2200       |
| Mid Section Tubular       | Before Nov,30,2016  |       2000       |
| Mid Section Tubular       | After Dec,1,2016    |       2200       |
| Mid Section Tubeless      | Before Nov,30,2016  |       2000       |
| Mid Section Tubeless      | After Dec,1,2016    |       2200       |
| Deep Section Tubular      | Before Nov,30,2016  |       2000       |
| Deep Section Tubular      | After Dec,1,2016    |       2200       |
| Deep Section Tubeless     | Before Nov,30,2016  |       2000       |
| Deep Section Tubeless     | After Dec,1,2016    |       2200       |
| Aluminium Braking Surface Tubular | Before Nov,30,2016  |       2000       |
| Aluminium Braking Surface Tubular   | After Dec,1,2016    |       2200       |
| Aluminium Braking Surface Tubeless  | Before Nov,30,2016  |       2000       |
| Aluminium Braking Surface Tubeless  | After Dec,1,2016    |       2200       |
| Carbon Braking surface Tubular   | Before Nov,30,2016  |       2000       |
| Carbon Braking surface Tubular   | After Dec,1,2016    |       2200       |
| Carbon Braking surface Tubeless  | Before Nov,30,2016  |       2000       |
| Carbon Braking surface Tubeless  | After Dec,1,2016    |       2200       |
