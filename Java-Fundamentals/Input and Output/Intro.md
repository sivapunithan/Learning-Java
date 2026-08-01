# What is I/O in Java?

   Input  -> Reading data
   Output -> Writing data

   Input can come from:
     Keyboard
     File
     Network
     Database
     S3
     Kafka

   Output can go to:
     Console
     File
     Network
     S3
     Kafka

## What is a Stream ?

     Imagine a water pipe
       Source -> Pipe -> Destination
       Water -> Pipe -> Tap, Stream is exactly that idea

## Why not read everything at once ?
    
    Imagine a movie 50GB, if you load entire file into RAM, RAM will crash 
    So we read piece by piece
    
    Instead of this java says 'Give me little by little', that little by little is Stream

    Stream is sequence of data

## Types of Streams

    There are two types of streams
      1. Byte Stream -> Reading data in the form of bytes (8 bits)
      2. Character Stream -> Reading data in the form of characters (16 bits)

## InputStream
  
    This is the lowest level reader.

     File
      │
      ▼
InputStream
      │
      ▼
    byte
    byte
    byte
    byte

    InputStream knows nothing about english, nothing about tamil nothing about UTF_8 "only bytes"

    InputStream input = new FileInputStream("hello.txt");

## Reader

     File
      │
      ▼
  Reader
      │
      ▼
  Character
  Character
  Character
  Character

     Humans don't want bytes.

## Buffered Reader

    Now the main question is , suppose the file is 
       hello
       world 
       java
    
    without buffering, java keeps asking the OS for every character!
    'OS give me 1 char' -> OS gives
    'OS give me 1 char' -> OS gives
    'OS give me 1 char' -> OS gives
    
    This is super slow!

     Buffered reader first reads in chunks (8KB).
        ┌───────────────────┐
        │  Chunk 1 (8KB)   │  <- First request
        │  'h','e','l','l','o'  │
        └───────────────────┘
                   │
                   ▼
              Read all at once

        ┌───────────────────┐
        │  Chunk 2 (8KB)   │  <- Second request
        │  'w','o','r','l','d' │
        └───────────────────┘
                   │
                   ▼
              Read all at once

## Writer

    This is the lowest level writer.
    Writer is the opposite

             Java
              ↓
            Writer
              ↓
             File

## What is this Stream really ?

     If you are reading from a File

    ┌──────────────────────────┐
    │         FILE             │
    │   h,e,l,l,o, ,w,o,r,l,d  │
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │       InputStream          │  <-- 1st byte
    │                            │  <-- 2nd byte
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │     InputStreamReader      │  <-- Converts bytes to chars
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │    BufferedReader        │  <-- Reads in chunks (8KB)
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │     Your Java Code       │  <-- Receives chars (not bytes!)
    │   - Decodes to String      │
    │   - Prints to console      │
    └──────────────────────────┘

## What is this writer really ?

    Imagine you have your novel

    ┌──────────────────────────┐
    │     YOUR JAVAS CODE      │  
    │  - Writes sentences...     │
    │  - Writes paragraphs...    │
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │    BufferedWriter        │  <-- Buffers 8KB chunks
    │                            │  <-- Flushes to disk periodically
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │    OutputStreamWriter      │  <-- Converts chars → bytes
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │       OutputStream         │  <-- Writes raw bytes
    └──────────────────────────┘
          │
          ▼
    ┌──────────────────────────┐
    │         FILE             │
    │   h,e,l,l,o, ,w,o,r,l,d  │
    └──────────────────────────┘