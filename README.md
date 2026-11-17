
# Gaza Coupon Hub

A simple coupon management application for shops in Gaza,
developed using Kotlin.

## Features

- View available coupons
- Add a new coupon
- Search for a coupon by code
- Exit the application

## Technologies

- Kotlin
- Java
- Docker
- Git and GitHub

## Run with Docker

### Build the Docker image

```bash
docker build -t gaza-coupon-hub .
```

### Run the application

```bash
docker run -it --rm gaza-coupon-hub
```

## Example

Choose option 1 to view available coupons.

Choose option 2 to add a new coupon.

Choose option 3 to search for a coupon.

Choose option 4 to exit.

## Notes

- Coupons are examples for educational purposes.
- Data is stored in memory and resets when the program exits.
- No external configuration is required.
- The container stops when the user selects Exit.
- The --rm option removes the container after it stops.

## Author

Operating Systems Lab - Assignment 2

