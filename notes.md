# Technical Notes – Gaza Coupon Hub

## 1. Project Overview

Gaza Coupon Hub is a simple Kotlin console application that allows users to view, add, and search for discount coupons.

## 2. Docker Challenge

One challenge was that Docker was not initially available inside Ubuntu WSL.

**Solution:** I installed Docker Desktop on Windows, enabled WSL integration for Ubuntu, and verified the connection using `docker info`.

After that, I successfully built the Docker image and ran the application inside a container.

## 3. Docker Build

I used a multi-stage Dockerfile:

- The first stage compiles the Kotlin source code into a JAR file.
- The second stage runs the application using Java.

This allows the project to be built without installing Kotlin on the host computer.

## 4. Git and GitHub

Git is used to track changes locally, while GitHub hosts the repository online.

The most important Git lesson will be understanding the difference between staging, committing, and pushing changes.