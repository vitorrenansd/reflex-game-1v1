import pygame as pg

pg.init()

background_color = (20, 20, 20)
width = 640
height = 480
small_font = pg.font.SysFont("Arial", 30)

screen = pg.display.set_mode((width, height)) # screen dimensions
pg.display.set_caption("Reflex Game") # window title
screen.fill(background_color)

text_surface = small_font.render("teste", True, (255, 255, 255))

running = True

while running:
    for event in pg.event.get():
        if event.type == pg.QUIT:
            running = False
    screen.blit(text_surface, (width/2, height/2))
    pg.display.flip() # updates the display
