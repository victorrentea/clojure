(require '[clojure.string :as str])


(defn staiincasa
  ([& mancare] (println (str "Viata cu " mancare)))
  ([] (staiincasa "Netflix"))
  )

;(do = {
(println "What's your name?")
;(let [name (read-line)]                                   ; adica (read-line) citeste de la tasy
;  (println (str "Hey, " name)))
(let [firstName "prost" lastName "MARE"]
  (println '(str "Hey " firstName " " lastName))
  (println "GATA\tF|GAT\n\n")
  (println (+ 3 4 6))
  (println {:first "FN", :last "LN"})

  (def x 7)
  (println '(1 2 3 4 5 6 7))
  (println [1 2 3 4 5 6 '(7 8)])

  (prn (+ x x))
  (staiincasa "pateu vegetal")
  (staiincasa)

  (println (/ (+ 7 (* 3 4) 5) 10))
  (println (/ 24 10))
  (println (rem 24 10))
  (println (quot 24 10))

  ;(println (max 1 2))
  (println (map inc [1 2 3 4]))
  (println (map str/upper-case [firstName lastName]))
  )
