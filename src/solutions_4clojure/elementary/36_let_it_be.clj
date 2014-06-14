(= 10 (let [z 1, y 3, x 7] (+ x y)))

(= 4  (let [z 1, y 3, x 7] (+ y z)))

(= 1  (let [z 1, y 3, x 7] z))
